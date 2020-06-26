package com.kodilla.testing.library;

import java.util.*;

interface LibraryDatabase{
    List<Book> listBooksWithCondition(String titleFragment);
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);
}
