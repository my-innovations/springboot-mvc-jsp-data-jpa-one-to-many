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

import com.mightyjava.entity.Address;
import com.mightyjava.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressMvcController {

	private AddressService addressService;

	@Autowired
	public AddressMvcController(AddressService addressService) {
		this.addressService = addressService;
	}

	@GetMapping("/form")
	public String addressForm(Model model) {
		model.addAttribute("addressForm", new Address());
		return "address/add_address_form";
	}

	@RequestMapping("/save")
	public String saveAddress(@ModelAttribute Address address) {
		addressService.saveAddress(address);
		return "redirect:/address/all";
	}

	@RequestMapping("/{id}")
	public String findAddressById(@PathVariable Long id, Model model) {
		Address address = addressService.findAddressById(id);
		model.addAttribute("address", address);
		return "view_address_by_id";
	}

	@RequestMapping(value = "/editAddressForm/{addr_id}", method = RequestMethod.GET)
	public String updateAddressFormPage(@PathVariable Long addr_id, ModelMap map) {
		Address address = addressService.findAddressById(addr_id);
		map.addAttribute("address", address);
		return "address/update_address_form";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String UpdateAddressById(@Valid @ModelAttribute Address address, BindingResult br, ModelMap map) {
		if (br.hasErrors()) {
			return "address/update_address_form";
		}
		addressService.updateAddress(address);
		return "redirect:/address/all";
	}

	@RequestMapping("/all")
	public String addressList(Model model) {
		List<Address> list = addressService.addressList();
		model.addAttribute("list", list);
		return "address/view_all_addresses_with_all_friends";
	}

	@RequestMapping("/delete/{id}")
	public String deleteAddress(@PathVariable Long id) {
		addressService.deleteAddress(id);
		return "redirect:/address/all";
	}
}
