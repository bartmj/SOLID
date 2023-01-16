package S.incorrect;

//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/user")
//public class UserController {
//
//    private final UserRepository userRepository;
//
//    @GetMapping
//    public ResponseEntity<UserDto> getUser() {
//        // first we get the user id from the security context
//        UserDetailsImpl principal = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        Long userId = principal.getId();
//        // then we fetch the user from the database
//        User user = userRepository.findById(username);
//        // we map the user object to dto (data transfer object), i.e. the object used for data transfer
//        UserDto userDto = UserDto.builder()
//                .id(user.getId())
//                .name(user.getName());
//        // and of course we return dto in the responses
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(userDto);
//    }
//
//}
