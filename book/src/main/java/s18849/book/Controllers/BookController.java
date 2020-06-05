package s18849.book.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import s18849.book.Models.Book;
import s18849.book.Services.IBookService;


@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService service;

    @GetMapping("/all")
    public String getAllBooks(Model model) {
        try{
            Iterable<Book> books = service.findAll();
            model.addAttribute("books", books);
            return "getAll";
        }catch (Exception e){
            return "notFound";
        }

    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id, Model model) {
        Book book;
        try {
            book = service.findById(id).get();
            model.addAttribute("book", book);
            return "getById";
        } catch (Exception e) {
            return "notFound";
        }

    }
}
