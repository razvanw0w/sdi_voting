package ro.ubb.razvan.county.dto;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VoteDTO {
    String name;
    int a;
    int b;
    int c;
    int nr;
}
