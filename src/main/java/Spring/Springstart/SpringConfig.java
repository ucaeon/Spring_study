package Spring.Springstart;

import Spring.Springstart.domain.Member;
import Spring.Springstart.repository.MemberRepository;
import Spring.Springstart.repository.MemoryMemberRepository;
import Spring.Springstart.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }



}
