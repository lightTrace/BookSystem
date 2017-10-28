package cn.com.dao;

import cn.com.entity.Book;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * ${DESCRIPTION}
 *
 * @author lightTrace
 * @create 2017-10-26 21:37
 **/

public interface BookDao {
    Book queryById(long id);
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBookById(long id);
}
