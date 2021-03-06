//package pl.pollub53.springBus.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import pl.pollub53.springBus.domain.User;
//import pl.pollub53.springBus.services.UserService;
//
//@Controller
//public class UserController {
//    @Autowired
//    private UserService userService;
//
//   //@Autowired
//    //private SecurityService securityService;
//
//    //@Autowired
//    //private UserValidator userValidator;
//
//    @RequestMapping(value = "/registration", method = RequestMethod.GET)
//    public String registration(Model model) {
//        model.addAttribute("userForm", new User());
//
//        return "registration";
//    }
//
//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
//        //userValidator.validate(userForm, bindingResult);
//
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//
//        userService.create(userForm);
//
//        //securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());
//
//        return "redirect:/welcome";
//    }
//
////    @RequestMapping(value = "/login", method = RequestMethod.GET)
////    public String login(Model model, String error, String logout) {
////        if (error != null)
////            model.addAttribute("error", "Your username and password is invalid.");
////
////        if (logout != null)
////            model.addAttribute("message", "You have been logged out successfully.");
////
////        return "login";
////    }
//
//    // Login form
//    @RequestMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    // Login form with error
//    @RequestMapping("/login-error.html")
//    public String loginError(Model model) {
//        model.addAttribute("loginError", true);
//        return "login";
//    }
//
////    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
//    @RequestMapping(value = {"/welcome"}, method = RequestMethod.GET)
//    public String welcome(Model model) {
//        return "welcome";
//    }
//
//
//}
