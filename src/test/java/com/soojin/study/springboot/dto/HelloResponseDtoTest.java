package com.soojin.study.springboot.dto;

import com.soojin.study.springboot.web.dto.HelloResponseDto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class HelloResponseDtoTest {

    @Test
    public void lombok_test() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name); //isEqualTo : 동등 비교 메소드 , assertThat에 있는 값과 isEqualTo에 있는 값이 일치하면 성공
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
