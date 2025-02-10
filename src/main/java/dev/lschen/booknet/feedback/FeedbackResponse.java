package dev.lschen.booknet.feedback;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackResponse {
    private Double score;
    private String comment;
    private boolean ownFeedback;

}
