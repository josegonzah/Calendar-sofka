package co.com.sofka.calendar.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Objects;

public final class ProgramDate {
    @Id
    private String id;
    private final String categoryName;
    private final LocalDate date;

    public ProgramDate(String categoryName, LocalDate date) {
        this.categoryName = Objects.requireNonNull(categoryName);
        this.date = Objects.requireNonNull(date);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "ProgramDate{" +
                "id='" + id + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", date=" + date +
                '}';
    }
}
