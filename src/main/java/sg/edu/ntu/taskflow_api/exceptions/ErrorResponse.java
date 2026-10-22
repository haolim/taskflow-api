package sg.edu.ntu.taskflow_api.exceptions;

import java.time.LocalDateTime;

public record ErrorResponse(String message, LocalDateTime timeStamp) {

}
