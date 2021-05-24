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
		return "friend/add_friend_form";
	}

	@RequestMapping("/save")
	public String saveFriend(@Valid @ModelAttribute Friend friend,BindingResult br) {
		if (br.hasErrors()) {
			return "friend/add_friend_form";
		}
		friendService.saveOrUpdateFriend(friend);
		return "redirect:/friend/all";
	}

	@RequestMapping("/{id}")
	public String findFriendWithAddressesByFriendId(@PathVariable Long id, ModelMap map) {
		Friend f = friendService.findFrind(id);
		map.addAttribute("friend", f);
		return "friend/view_frind_addresses";
	}

	@RequestMapping("/all")
	public String allFriendsList(Model model) {
		List<Friend> list = friendService.findAllFriends();
		model.addAttribute("friends", list);
		return "friend/view_all_friends";
	}

	@RequestMapping(value = "/editFriendForm/{friend_id}", method = RequestMethod.GET)
	public String updateFriendFormPage(@PathVariable Long friend_id, ModelMap map) {
		Friend friend = friendService.findFrind(friend_id);
		map.addAttribute("friend", friend);
		return "friend/update_friend_form";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String UpdateAddressById(@Valid @ModelAttribute Friend friend, BindingResult br, ModelMap map) {
		if (br.hasErrors()) {
			return "friend/update_friend_form";
		}
		friendService.saveOrUpdateFriend(friend);
		return "redirect:/friend/all";
	}
	
	//not used
	@RequestMapping(value = "/newAddressForm/{friend_id}", method = RequestMethod.GET)
	public String saveOrUpdateAddressFormPage(@PathVariable Long id,Model model) {
		model.addAttribute("friendId", id);
		return "address/add_address_form";
	}

	@RequestMapping("/delete/{id}")
	public String deleteFriend(@PathVariable Long id) {
		friendService.deleteFriend(id);
		return "redirect:/friend/all";
	}
}
