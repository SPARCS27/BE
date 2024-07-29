package com.github.jeongrae.springkit.domain.auth.token;

import com.github.jeongrae.springkit.domain.auth.token.vo.AccessToken;
import com.github.jeongrae.springkit.domain.auth.token.vo.RefreshToken;
import com.github.jeongrae.springkit.domain.member.domain.Member;
import com.github.jeongrae.springkit.domain.member.dto.MemberDTO;

public interface TokenProvider {
    AccessToken generateAccessToken(Member member);
    AccessToken generateAccessToken(MemberDTO memberDTO);

    RefreshToken generateRefreshToken(Member member);
    RefreshToken generateRefreshToken(MemberDTO memberDTO);
}
