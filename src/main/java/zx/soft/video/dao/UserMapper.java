package zx.soft.video.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import zx.soft.video.model.Users;

public interface UserMapper {

	@Insert("INSERT INTO `users` (`uname`,`upass`) VALUES (#{uname},#{upass})")
	public void addUser(Users users);

	@Select("SELECT * FROM `users` WHERE `uname` = #{uname} AND `upass` = #{upass}")
	public Users login(Users users);

}
