#######################################################
#
# 데이터 조작 언어(DML : Data Manipulation Language)
#
#######################################################
# MySQL 8.0
# 기본 인코딩 : utf8nb4 
# 이모지 까지


/*
 * 2. Update
 * 
   UPDATE 테이블명
  		SET 필드명=값[, 필드명=값, 필드명=값, ...]
  		WHERE 조건;
 */

UPDATE city SET `Name`='Sihung'	WHERE `Name`='Shihung';
UPDATE city SET `Name`='수원', Population=1200000
	WHERE ID=2340;
	

	
/*
 * 3. INSERT
 * 
 * INSERT INTO 테이블명 [(필드명)]
 * 		VALUES (필드값)[, (필드값), ...];
 */
	
# 강원도 속초시 추가
INSERT INTO city (`Name`, CountryCode, District)
	VALUES ('속초', 'KOR', 'Kang-won');
	
INSERT INTO city (`Name`, CountryCode, District, Population)
	VALUES ('속초', 'KOR', 'Kang-won', 100000);
	
INSERT INTO city 
	VALUES (DEFAULT, '속초', 'KOR', 'Kang-won', 100000);
	
INSERT INTO city		# auto_increment 속성을 갖더라도 임의의 값 부여 가능
	VALUES (5000, '속초', 'KOR', 'Kang-won', 100000);
	
# 여러건의 데이터 입력
# 경기도에 화성시와 의정부시를 추가
INSERT INTO city VALUES
	(DEFAULT, '화성', 'KOR', 'Kyonggi', 500000),
	(DEFAULT, '의정부', 'KOR', 'Kyonggi', 200000);
	

# 대량 데이터 삽입
# 국내 도시만으로 된 새로운 테이블을 만드는 경우 
CREATE TABLE if NOT EXISTS koreanCity LIKE city;
INSERT INTO koreanCity 
	SELECT * FROM city WHERE countryCode='KOR';


/*
 * 4. DELETE
 * 
 * DELETE from table WHERE 조건;
 */

DELETE from city WHERE id=4080;

DELETE from city WHERE id >= 4080 AND id <= 5000;
DELETE from city WHERE id BETWEEN 4080 and 5000;

	
	
	
	