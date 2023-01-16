package S.correct;

//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/user")
//public class UserController {
//
//    private final UserService service;
//    private final UserMapper userRestMapper;
//    private final IAuthenticationFacade authFacade;
//
//    @CrossOrigin
//    @GetMapping
//    public ResponseEntity<User> getUser() {
//        Long userId = authFacade.getUserId();
//        User user = service.getUser(userId);
//        UserDto userDto = userRestMapper.toDto(user);
//
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(userDto);
//    }
//}
