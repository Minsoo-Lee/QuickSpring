package biz.com.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import biz.com.board.BoardVO;

// DAO (Data Access Object)
@Repository
public class BoardDAOSpring {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // SQL 명령어들
    private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values ((select nvl(max(seq), 0)+1 from board), ?,?,?)";
    private final String BOARD_UPDATE = "update board set title=?, content=?, where seq=?";
    private final String BOARD_DELETE = "delete board where=?";
    private final String BOARD_GET    = "select * from board where seq=?";
    private final String BOARD_LIST   = "select * from board order by seq desc";

    // CRUD 기능의 메서드 구현
    // 글 등록
    public void insertBoard(BoardVO vo) {
        System.out.println("===> Spring JDBC / insertBoard()");
        jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
    }

    // 글 수정
    public void updateBoard(BoardVO vo) {
        System.out.println("===> Spring JDBC / updateBoard()");
        jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
    }

    // 글 삭제
    public void deleteBoard(BoardVO vo) {
        System.out.println("===> Spring JDBC / deleteBoard()");
        jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
    }

    // 글 상세 조회
    public BoardVO getBoard(BoardVO vo) {
        System.out.println("===> Spring JDBC / getBoard()");
        Object[] args = {vo.getSeq()};
        return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
    }

    // 글 목록 조회
    public List<BoardVO> getBoardList(BoardVO vo) {
        System.out.println("===> Spring JDBC / getBoardList()");
        return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
    }
}

class BoardRowMapper implements RowMapper<BoardVO> {
    public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        BoardVO board = new BoardVO();
        board.setSeq(rs.getInt("SEQ"));
        board.setTitle(rs.getString("TITLE"));
        board.setWriter(rs.getString("WRITER"));
        board.setContent(rs.getString("CONTENT"));
        board.setRegDate(rs.getDate("REGDATE"));
        board.setCnt(rs.getInt("CNT"));
        return board;
    }
}