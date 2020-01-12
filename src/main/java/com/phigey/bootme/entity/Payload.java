package com.phigey.bootme.entity;

import lombok.*;

/**
 * @author lizf
 */

@Data
@ToString
@RequiredArgsConstructor
@Setter
@Getter
public class Payload {
    private String from;
    private String to;
    private String content;
}
