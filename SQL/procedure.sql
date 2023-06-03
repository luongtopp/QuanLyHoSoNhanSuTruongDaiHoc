USE quan_ly_ho_so_nhan_su_truong_dai_hoc;

-- Tìm kiếm cán bộ 
DELIMITER $$
CREATE PROCEDURE tim_kiem_can_bo ( IN
timkiem NVARCHAR(300) )
BEGIN 
SELECT * FROM canbo 
WHERE macanbo LIKE CONCAT('%', timkiem, '%') 
OR hotenkhaisinh LIKE CONCAT('%', timkiem, '%')
OR gioitinh LIKE CONCAT('%', timkiem, '%') 
OR ngaysinh LIKE CONCAT('%', timkiem, '%') 
OR tinhtranghonnhan LIKE CONCAT('%', timkiem, '%') 
OR soCMND LIKE CONCAT('%', timkiem, '%') 
OR quequan LIKE CONCAT('%', timkiem, '%') 
OR noiohientai LIKE CONCAT('%', timkiem, '%') 
OR email LIKE CONCAT('%', timkiem, '%') 
OR dantoc LIKE CONCAT('%', timkiem, '%') 
OR tongiao LIKE CONCAT('%', timkiem, '%') 
OR ngayhopdong LIKE CONCAT('%', timkiem, '%') 
OR congviecduocgiao LIKE CONCAT('%', timkiem, '%') 
OR machucvu LIKE CONCAT('%', timkiem, '%') 
OR chuyennganhdaotao LIKE CONCAT('%', timkiem, '%') 
OR noidaotao LIKE CONCAT('%', timkiem, '%') 
OR namtotnghiep LIKE CONCAT('%', timkiem, '%') 
OR trinhdongoainnguthanhthaonhat LIKE CONCAT('%', timkiem, '%') 
OR maphongban LIKE CONCAT('%', timkiem, '%');
 END; $$
DELIMITER ;

`macanbo`,
        `hotenkhaisinh`,
        `gioitinh`,
        `ngaysinh`,
        `tinhtranghonnhan`,
        `soCMND`,
        `quequan`,
        `noiohientai`,
        `email`,
        `dantoc`,
        `tongiao`,
        `ngayhopdong`,
-- Tìm kiếm cán bộ 

DELIMITER $$
CREATE PROCEDURE thong_ke_can_bo_sap_ve_huu()
BEGIN 
SELECT canbo.macanbo, hotenkhaisinh, quequan, ngaysinh, 
ngayhopdong,  DATE_ADD(canbo.ngaysinh, INTERVAL 60 YEAR)
 AS ngaynghihuu FROM canbo 
 JOIN thongtinnghihuu 
 ON canbo.macanbo = thongtinnghihuu.macanbo WHERE YEAR(CURRENT_DATE)-YEAR(canbo.ngaysinh) > 58;
END; $$
DELIMITER ;


SELECT DATE_ADD('2022-06-15', INTERVAL 60 YEAR) AS ngay_hien_tai;



 
 
--  YEAR(CURRENT_DATE)-YEAR(canbo.ngaysinh) > 60

