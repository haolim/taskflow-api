package sg.edu.ntu.taskflow_api.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({ "id", "title", "description", "isCompleted" })
public class Task {

    private Long id;
    private String title;
    private String description;
    private Boolean isCompleted = false;

}