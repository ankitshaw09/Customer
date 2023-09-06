package sunbasedata.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sunbasedata.demo.model.user;
import sunbasedata.demo.service.userService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private userService usrService;

    @PostMapping("/")
    public user createUser(@RequestBody user ur) throws Exception {
        return this.usrService.createUser(ur);

    }

    // @GetMapping("/{username}")
    // public user getUser(@PathVariable("username") String username) throws
    // Exception {
    // return this.userService.getUser(username);
    // }

    // @DeleteMapping("/{userId}")
    // public void deleteUser(@PathVariable("userId") Long userId) throws Exception{
    // this.userService.deleteUser(userId);
    // }

}
