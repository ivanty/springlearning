package com.xue.springlearning.repository;

import com.xue.springlearning.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//CrudReposi
/**
 * 用户仓库
 * @author xuezhigang
 * @since 1.0.0 2018年11月23日
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
