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

import com.mightyjava.entity.v2.Address;
import com.mightyjava.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressMvcController {

	private AddressService addressService;

	@Autowired
	public AddressMvcController(AddressService addressService) {
		this.addressService = addressService;
	}

	@GetMapping("/form/{friendId}")
	public String addressForm(@PathVariable Long friendId, Model model) {
		model.addAttribute("addressForm", new Address());
		model.addAttribute("friendId", friendId);
		return "address/add_address_form";
	}

	@RequestMapping("/save")
	public String saveAddress(@Valid @ModelAttribute Address address, BindingResult br, ModelMap map) {
		if (br.hasErrors()) {
			return "address/add_address_form";
		}
		addressService.saveOrUpdateAddress(address);
		return "redirect:/address/all";
	}

	@RequestMapping("/{addrId}")
	public String findAddressById(@PathVariable Long addrId, Model model) {
		Address address = addressService.findAddressByAddressId(addrId);
		model.addAttribute("address", address);
		return "view_address_by_id";
	}

	@RequestMapping("/all")
	public String addressList(Model model) {
		List<Address> list = addressService.findAllAddresses();
		model.addAttribute("list", list);
		return "address/view_all_friends_with_addresses";
	}

	@RequestMapping(value = "/editAddressForm/{addrId}", method = RequestMethod.GET)
	public String updateAddressFormPage(@PathVariable Long addrId, ModelMap map) {
		Address address = addressService.findAddressByAddressId(addrId);
		map.addAttribute("address", address);
		return "address/update_address_form";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String UpdateAddressById(@Valid @ModelAttribute Address address, BindingResult br, ModelMap map) {
		if (br.hasErrors()) {
			return "address/update_address_form";
		}
		addressService.saveOrUpdateAddress(address);
		return "redirect:/address/all";
	}

	@RequestMapping("/delete/{addrId}")
	public String deleteAddress(@PathVariable Long addrId) {
		addressService.deleteAddressByAddrId(addrId);
		return "redirect:/address/all";
	}
}
