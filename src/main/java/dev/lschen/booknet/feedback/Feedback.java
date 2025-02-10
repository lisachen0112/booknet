package dev.lschen.booknet.feedback;


import dev.lschen.booknet.book.Book;
import dev.lschen.booknet.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Feedback extends BaseEntity {
    private Double score;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
