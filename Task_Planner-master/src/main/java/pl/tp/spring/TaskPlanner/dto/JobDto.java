package pl.tp.spring.TaskPlanner.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class JobDto {
    @NotNull
    @Size(min = 2, max = 30)
    private String name;
    @NotNull
    private Long account;

    public String getName() {
        return name;
    }

    public JobDto setName(String name) {
        this.name = name;
        return this;
    }

    public Long getAccount() {
        return account;
    }

    public JobDto setAccount(Long account) {
        this.account = account;
        return this;
    }
}
