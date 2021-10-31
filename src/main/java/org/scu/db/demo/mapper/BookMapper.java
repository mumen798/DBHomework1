package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scu.db.demo.model.Book;
import org.scu.db.demo.model.Title;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    List<Book> queryBook();
    List<Map> query_call_and_count();

    List<Integer> findAllBorrowedBooksId();

    List<Title> findIliadOrOdysseyTitle();

    Integer countCall123Book();

    List<String> findCountNotExceed2Callnumber();
}
