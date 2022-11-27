package biz.com.board.impl;

import java.util.List;

import biz.com.board.BoardService;
import biz.com.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardDAOSpring boardDAOSpring;

    @Override
    public void insertBoard(BoardVO vo) {
        /*
        // after throwing statement
        if (vo.getSeq() == 0) {
            throw new IllegalArgumentException("Can't register number 0");
        }
         */
        boardDAOSpring.insertBoard(vo);

    }

    @Override
    public void updateBoard(BoardVO vo) {
        boardDAOSpring.updateBoard(vo);
    }

    @Override
    public void deleteBoard(BoardVO vo) {
        boardDAOSpring.deleteBoard(vo);
    }

    @Override
    public BoardVO getBoard(BoardVO vo) {
        return boardDAOSpring.getBoard(vo);
    }

    @Override
    public List<BoardVO> getBoardList(BoardVO vo) {
        return boardDAOSpring.getBoardList(vo);
    }
}
