package truecut.service.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import truecut.common.db.MyBatisConnectionFactory;
import truecut.model.CodeC;

public class TestDb extends MyBatisConnectionFactory {
	SqlSessionFactory sqlSessionFactory;
	public TestDb() {
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}

	public void selectCodeC() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			List<CodeC> list = session.selectList("CodeC.getAll");
			for(CodeC cc : list) {
				System.out.println(cc.toString());
			}
		} finally {
			session.close();
		}
		
	}

	public static void main(String[] args) {
		TestDb td = new TestDb();
		td.selectCodeC();
	}

}




//	public EnquiryResponse selectById(int id) {
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			EnquiryResponse contact = (EnquiryResponse) session.selectOne("EnquiryResponse.getById", id);
//			return contact;
//		} finally {
//			session.close();
//		}
//	}

