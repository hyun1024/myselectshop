package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    //위의 메서드를 SQL문으로 변경하면 아래 내용과 같음
    // select * from folder
    // where user_id = 1 and name in ('1', '2', '3');
    List<Folder> findAllByUser(User user);


}
