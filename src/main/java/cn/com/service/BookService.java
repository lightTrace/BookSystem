package cn.com.service;


import cn.com.entity.Book;
import java.util.List;
/**
 * ${DESCRIPTION}
 *
 * @author lightTrace
 * @create 2017-10-26 21:52
 **/
public interface BookService {
    Book getById(long bookId);
    List<Book> getList(int start, int pageNum);
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBookById(long id);
}
