# [Services](https://login.codingdojo.com/m/315/9533/64301)

## Learning Objectives:

- Create a service layer to perform business login in your application
- Use Postman to write data to your database
- Have all the necessary tools to create an application that makes use of MySQL




> You may ask why we bother with a service layer when we could simply use the repository in our controller. The purpose of the service layer is to perform any business logic before using the repository to perform queries. In short, layering provides separation of concerns. The value of separating concerns becomes more apparent as our applications grow.


```java
// ...
import org.springframework.stereotype.Service;
import com.codingdojo.mvc.models.Book;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}



```