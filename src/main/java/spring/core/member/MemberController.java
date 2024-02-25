package spring.core.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member")
    public void join(Long memberId, String memberName, Grade grade) {
        memberService.join(new Member(memberId, memberName, grade));
    }

    @GetMapping("/member")
    public Member findMember(@RequestParam("memberId") Long memberId) {
        return memberService.findMember(memberId);
    }
}
