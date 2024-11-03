package seg3x02.books_rest_api.representation

import com.fasterxml.jackson.annotation.JsonInclude
import org.springframework.hateoas.RepresentationModel

@JsonInclude(JsonInclude.Include.NON_NULL)
class BookTitleRepresentation:  RepresentationModel<BookTitleRepresentation>() {
    var title: String = ""
}