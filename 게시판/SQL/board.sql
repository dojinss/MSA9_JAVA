-- 게시판 테이블 생성
CREATE TABLE `javatest`.`board` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `writer` VARCHAR(100) NOT NULL,
  `content` TEXT NULL,
  `reg_date` TIMESTAMP NOT NULL DEFAULT now(),
  `upd_date` TIMESTAMP NOT NULL DEFAULT now(),
  PRIMARY KEY (`no`))
COMMENT = '게시판';

-- 조회
SELECT * FROM board;

-- 추가
INSERT INTO board (title, writer, content)
VALUES ( '게시글 제목 03','황조은','집에가고싶다');

-- 수정
UPDATE board 
   SET title = '수정이'
      ,writer = '힘조은'
      ,content = '걍감'
      ,upd_date = now()
WHERE no = 4;

-- 삭제
DELETE FROM board 
WHERE no = 1;
