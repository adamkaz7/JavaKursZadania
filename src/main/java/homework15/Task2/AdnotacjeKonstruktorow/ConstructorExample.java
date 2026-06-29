package homework15.Task2.AdnotacjeKonstruktorow;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ConstructorExample {
    private String name;
    private int age;

    @NonNull
    private String email;
}
