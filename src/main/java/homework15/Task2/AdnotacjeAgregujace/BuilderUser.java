package homework15.Task2.AdnotacjeAgregujace;

import lombok.Builder;
import lombok.ToString;

@Builder(toBuilder = true, builderMethodName = "create", buildMethodName = "finish")
@ToString
public class BuilderUser {
    private String name;
    private int age;
    private String email;
}
