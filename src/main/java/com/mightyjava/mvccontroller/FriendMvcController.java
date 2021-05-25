package com.mightyjava.mvccontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mightyjava.entity.v2.Friend;
import com.mightyjava.service.FriendService;

@Controller
@RequestMapping("/friend")
public class FriendMvcController {

	private FriendService friendService;

	@Autowired
	public FriendMvcController(FriendService friendService) {
		this.friendService = friendService;
	}

	@RequestMapping({ "/", "/home" })
	public String homePage() {
		return "home";
	}// http://localhost:8081/friend/

	@GetMapping("/new")
	public String saveFriendForm(Model model) {
		model.addAttribute("newFriend", new Friend());
		return "friend/add_friend_form2";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveFriend(@Valid @ModelAttribute Friend friend, BindingResult br, ModelMap map) {
		if (br.hasErrors()) {
			return "friend/add_friend_form";
		}
		friendService.saveOrUpdateFriend(friend);
		return "redirect:/friend/all";
	}

	@RequestMapping("/{friendId}")
	public String findFriendWithAddressesByFriendId(@PathVariable Long friendId, ModelMap map) {
		Friend f = friendService.findFrindById(friendId);
		map.addAttribute("friend", f);
		return "friend/view_frind_addresses";
	}

	@RequestMapping("/all")
	public String allFriendsList(Model model) {
		List<Friend> list = friendService.findAllFriends();
		model.addAttribute("friends", list);
		return "friend/view_all_friends";
	}

	@RequestMapping(value = "/editFriendForm/{friendId}", method = RequestMethod.GET)
	public String updateFriendFormPage(@PathVariable Long friendId, ModelMap map) {
		Friend friend = friendService.findFrindById(friendId);
		map.addAttribute("friend", friend);
		return "friend/update_friend_form";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String updateFriendById(@Valid @ModelAttribute Friend friend, BindingResult br, ModelMap map) {
		if (br.hasErrors()) {
			return "friend/update_friend_form";
		}
		friendService.saveOrUpdateFriend(friend);
		return "redirect:/friend/all";
	}

	// not used
	@RequestMapping(value = "/newAddressForm/{friendId}", method = RequestMethod.GET)
	public String saveOrUpdateAddressFormPage(@PathVariable Long friendId, Model model) {
		model.addAttribute("friendId", friendId);
		return "address/add_address_form";
	}

	@RequestMapping("/delete/{friendId}")
	public String deleteFriendById(@PathVariable Long friendId) {
		friendService.deleteFriendById(friendId);
		return "redirect:/friend/all";
	}
}
