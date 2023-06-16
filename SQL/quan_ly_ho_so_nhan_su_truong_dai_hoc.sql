-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 16, 2023 lúc 03:46 AM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";
CREATE DATABASE `quan_ly_ho_so_nhan_su_truong_dai_hoc`;
USE `quan_ly_ho_so_nhan_su_truong_dai_hoc`;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quan_ly_ho_so_nhan_su_truong_dai_hoc`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bacngach`
--

CREATE TABLE `bacngach` (
  `mabacngach` varchar(10) NOT NULL,
  `tenbacngach` varchar(255) DEFAULT NULL,
  `hesoluong` decimal(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `bacngach`
--

INSERT INTO `bacngach` (`mabacngach`, `tenbacngach`, `hesoluong`) VALUES
('BL01', 'Bậc 1', '3.21'),
('BL02', 'Bậc 2', '3.60'),
('BL03', 'Bậc 3', '3.90'),
('BL04', 'Bậc 4', '4.30'),
('BL05', 'Bậc 5', '4.60');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `canbo`
--

CREATE TABLE `canbo` (
  `macanbo` varchar(50) NOT NULL,
  `hotenkhaisinh` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `gioitinh` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `tinhtranghonnhan` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `soCMND` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `quequan` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `noiohientai` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `dantoc` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `tongiao` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `ngayhopdong` date DEFAULT NULL,
  `congviecduocgiao` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `machucvu` varchar(50) DEFAULT NULL,
  `chuyennganhdaotao` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `noidaotao` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `namtotnghiep` int(11) DEFAULT NULL,
  `trinhdongoainnguthanhthaonhat` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `maphongban` varchar(50) DEFAULT NULL,
  `anh` varchar(300)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `machucvu` varchar(50) NOT NULL,
  `tenchucvu` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `maphucap` varchar(10) DEFAULT NULL,
  `mabacngach` varchar(10) DEFAULT NULL,
  `maluong` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `chucvu`
--

INSERT INTO `chucvu` (`machucvu`, `tenchucvu`, `maphucap`, `mabacngach`, `maluong`) VALUES
('CV01', 'Ban giám hiệu', 'PC01', 'BL01', 'ML01'),
('CV02', 'Trưởng phòng', 'PC02', 'BL02', 'ML01'),
('CV03', 'Chuyên viên', 'PC03', 'BL03', 'ML01'),
('CV04', 'Giảng viên bộ môn Quản trị kinh doanh', 'PC05', 'BL05', 'ML01'),
('CV05', 'Giảng viên bộ môn Truyền thông và Mạng máy tính', 'PC01', 'BL01', NULL),
('CV06', 'Phó Bí thư Đoàn trường', 'PC02', 'BL02', 'ML01');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `danhgiacanbo`
--

CREATE TABLE `danhgiacanbo` (
  `id` int(11) NOT NULL,
  `macanbo` varchar(50) DEFAULT NULL,
  `namdanhgia` date DEFAULT NULL,
  `loai` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `nhanxet` varchar(300) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khenthuong`
--

CREATE TABLE `khenthuong` (
  `id` int(11) NOT NULL,
  `makhenthuong` varchar(50) DEFAULT NULL,
  `macanbo` varchar(50) DEFAULT NULL,
  `hinhthuckhenthuong` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `ngaykhenthuong` date DEFAULT NULL,
  `donvi` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `danhhieu` varchar(50) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `kyluat`
--

CREATE TABLE `kyluat` (
  `id` int(11) NOT NULL,
  `makyluat` varchar(50) DEFAULT NULL,
  `macanbo` varchar(50) DEFAULT NULL,
  `namkyluat` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `hinhthuckyluat` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `donvi` varchar(50) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `luongcoban`
--

CREATE TABLE `luongcoban` (
  `maluong` varchar(10) NOT NULL,
  `ngayhieuluc` date DEFAULT NULL,
  `ngayhethieuluc` date DEFAULT NULL,
  `mucluong` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `luongcoban`
--

INSERT INTO `luongcoban` (`maluong`, `ngayhieuluc`, `ngayhethieuluc`, `mucluong`) VALUES
('ML01', '2023-06-16', '2023-06-29', '1000.00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phongban`
--

CREATE TABLE `phongban` (
  `maphongban` varchar(50) NOT NULL,
  `tenphongban` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `diachi` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `sdt` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `phongban`
--

INSERT INTO `phongban` (`maphongban`, `tenphongban`, `diachi`, `sdt`, `email`) VALUES
('PB101', 'Phòng Hành chính - Quản trị', 'Phòng 101, 102, Nhà H1- Trường Đại học Công nghệ GTVT- Số 54 Triều Khúc - Thanh Xuân- Hà Nội', '0435527493', 'phonghcqt@utt.edu.vn'),
('PB102', 'Phòng Công tác sinh viên', 'Phòng 102, 104 Nhà H3 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội', '0435526714', 'phongcthssv@utt.edu.vn'),
('PB106', 'Phòng Quản lý đầu tư và Xây dựng cơ bản', 'Phòng 106, 107, Nhà H3- Trường Đại học Công nghệ GTVT- Số 54 Triều Khúc- Thanh Xuân- Hà Nội', '0435526714', 'banxdcb@utt.edu.vn'),
('PB111', 'Phòng Tổ chức cán bộ', 'Phòng 111 Nhà H1 - Trường Đại học Công nghệ GTVT- Số 54 Triều Khúc- Thanh Xuân- Hà Nội', '0435523953', 'thanhtragiaoduc@utt.edu.vn'),
('PB202', 'Phòng Khoa học công nghệ và Hợp tác quốc tế', 'Phòng 202, 203 - Nhà H3 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội', '0435527872', 'phongkhcn@utt.edu.vn'),
('PB206', 'Phòng Đào tạo', 'Phòng 206 Nhà H3 - Trường Đại học Công nghệ GTVT- Số 54 Triều Khúc - Thanh Xuân- Hà Nội', '0435526713', 'phongdaotao@utt.edu.vn'),
('PB207', 'Phòng Đào tạo Sau đại học', 'Phòng 207 Nhà H1 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội', '0432222.865', 'phongdtsdh@utt.edu.vn'),
('PB211', 'Phòng Tài chính - Kế toán', 'Phòng 211, 212 - Nhà H1 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội', '0438546903', 'phongtckt@utt.edu.vn'),
('PB304', 'Phòng Tổ chức cán bộ', 'Phòng 304, 202 Nhà H1 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội', '0435523950', 'phongtccb@utt.edu.vn');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phucap`
--

CREATE TABLE `phucap` (
  `maphucap` varchar(10) NOT NULL,
  `tenphucap` varchar(255) DEFAULT NULL,
  `hesophucap` decimal(5,2) DEFAULT NULL,
  `ghichu` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `phucap`
--

INSERT INTO `phucap` (`maphucap`, `tenphucap`, `hesophucap`, `ghichu`) VALUES
('PC01', 'Phụ cấp bậc 1', '0.40', 'không'),
('PC02', 'Phụ cấp bậc 2', '0.42', 'không'),
('PC03', 'Phụ cấp bậc 3', '0.51', 'không'),
('PC04', 'Phụ cấp bậc 4', '0.55', 'không'),
('PC05', 'Phụ cấp bậc 5', '0.60', 'không');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quanhe`
--

CREATE TABLE `quanhe` (
  `id` int(11) NOT NULL,
  `macanbo` varchar(50) DEFAULT NULL,
  `quanhe` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `hoten` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `namsinh` date DEFAULT NULL,
  `gioitinh` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `nghenghiep` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `diachi` varchar(50) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quatrinhcongtac`
--

CREATE TABLE `quatrinhcongtac` (
  `id` int(11) NOT NULL,
  `macanbo` varchar(50) DEFAULT NULL,
  `thoigianbatdau` date DEFAULT NULL,
  `thoigianketthuc` date DEFAULT NULL,
  `congviec` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `noicongtac` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `machucvu` varchar(50) DEFAULT NULL,
  `chucvucaonhat` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `tendangnhap` varchar(50) CHARACTER SET utf8 NOT NULL,
  `matkhau` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `ngaycapquyen` datetime DEFAULT NULL,
  `admin` bit(1) DEFAULT NULL,
  `hoten` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `maphongban` varchar(50) DEFAULT NULL,
  `machucvu` varchar(50) DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`tendangnhap`, `matkhau`, `ngaycapquyen`, `admin`, `hoten`, `maphongban`, `machucvu`, `email`) VALUES
('duong', '12345', '2023-06-03 00:00:00', b'1', 'User 3', 'PB206', 'CV03', 'user3@example.com'),
('luong', '12345', '2023-06-03 00:00:00', b'1', 'User 2', 'PB102', 'CV02', 'user2@example.com'),
('tuan', '12345', '2023-06-03 00:00:00', b'0', 'User 1', 'PB101', 'CV01', 'user1@example.com');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thongtinnghihuu`
--

CREATE TABLE `thongtinnghihuu` (
  `macanbo` varchar(50) NOT NULL,
  `soqdnghihuu` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `thoigiannghihuu` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinhluong`
--

CREATE TABLE `tinhluong` (
  `matinhluong` varchar(10) NOT NULL,
  `macanbo` varchar(50) DEFAULT NULL,
  `ngaybatdau` date DEFAULT NULL,
  `ngayketthuc` date DEFAULT NULL,
  `tongluong` decimal(10,2) DEFAULT NULL,
  `maluong` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bacngach`
--
ALTER TABLE `bacngach`
  ADD PRIMARY KEY (`mabacngach`);

--
-- Chỉ mục cho bảng `canbo`
--
ALTER TABLE `canbo`
  ADD PRIMARY KEY (`macanbo`),
  ADD KEY `maphongban` (`maphongban`),
  ADD KEY `fk_chucvu` (`machucvu`);

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`machucvu`),
  ADD KEY `fk_maphucap` (`maphucap`),
  ADD KEY `fk_mabacngach` (`mabacngach`),
  ADD KEY `fk_maluon` (`maluong`);

--
-- Chỉ mục cho bảng `danhgiacanbo`
--
ALTER TABLE `danhgiacanbo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `macanbo` (`macanbo`);

--
-- Chỉ mục cho bảng `khenthuong`
--
ALTER TABLE `khenthuong`
  ADD PRIMARY KEY (`id`),
  ADD KEY `macanbo` (`macanbo`);

--
-- Chỉ mục cho bảng `kyluat`
--
ALTER TABLE `kyluat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `macanbo` (`macanbo`);

--
-- Chỉ mục cho bảng `luongcoban`
--
ALTER TABLE `luongcoban`
  ADD PRIMARY KEY (`maluong`);

--
-- Chỉ mục cho bảng `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`maphongban`);

--
-- Chỉ mục cho bảng `phucap`
--
ALTER TABLE `phucap`
  ADD PRIMARY KEY (`maphucap`);

--
-- Chỉ mục cho bảng `quanhe`
--
ALTER TABLE `quanhe`
  ADD PRIMARY KEY (`id`),
  ADD KEY `macanbo` (`macanbo`);

--
-- Chỉ mục cho bảng `quatrinhcongtac`
--
ALTER TABLE `quatrinhcongtac`
  ADD PRIMARY KEY (`id`),
  ADD KEY `macanbo` (`macanbo`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`tendangnhap`),
  ADD KEY `maphongban` (`maphongban`),
  ADD KEY `machucvu` (`machucvu`);

--
-- Chỉ mục cho bảng `thongtinnghihuu`
--
ALTER TABLE `thongtinnghihuu`
  ADD PRIMARY KEY (`macanbo`);

--
-- Chỉ mục cho bảng `tinhluong`
--
ALTER TABLE `tinhluong`
  ADD PRIMARY KEY (`matinhluong`),
  ADD KEY `macanbo` (`macanbo`),
  ADD KEY `fk_maluong` (`maluong`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `danhgiacanbo`
--
ALTER TABLE `danhgiacanbo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `khenthuong`
--
ALTER TABLE `khenthuong`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `kyluat`
--
ALTER TABLE `kyluat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `quanhe`
--
ALTER TABLE `quanhe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `quatrinhcongtac`
--
ALTER TABLE `quatrinhcongtac`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `canbo`
--
ALTER TABLE `canbo`
  ADD CONSTRAINT `canbo_ibfk_1` FOREIGN KEY (`maphongban`) REFERENCES `phongban` (`maphongban`),
  ADD CONSTRAINT `fk_chucvu` FOREIGN KEY (`machucvu`) REFERENCES `chucvu` (`machucvu`);

--
-- Các ràng buộc cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD CONSTRAINT `fk_mabacngach` FOREIGN KEY (`mabacngach`) REFERENCES `bacngach` (`mabacngach`),
  ADD CONSTRAINT `fk_maluon` FOREIGN KEY (`maluong`) REFERENCES `luongcoban` (`maluong`),
  ADD CONSTRAINT `fk_maphucap` FOREIGN KEY (`maphucap`) REFERENCES `phucap` (`maphucap`);

--
-- Các ràng buộc cho bảng `danhgiacanbo`
--
ALTER TABLE `danhgiacanbo`
  ADD CONSTRAINT `danhgiacanbo_ibfk_1` FOREIGN KEY (`macanbo`) REFERENCES `canbo` (`macanbo`);

--
-- Các ràng buộc cho bảng `khenthuong`
--
ALTER TABLE `khenthuong`
  ADD CONSTRAINT `khenthuong_ibfk_1` FOREIGN KEY (`macanbo`) REFERENCES `canbo` (`macanbo`);

--
-- Các ràng buộc cho bảng `kyluat`
--
ALTER TABLE `kyluat`
  ADD CONSTRAINT `kyluat_ibfk_1` FOREIGN KEY (`macanbo`) REFERENCES `canbo` (`macanbo`);

--
-- Các ràng buộc cho bảng `quanhe`
--
ALTER TABLE `quanhe`
  ADD CONSTRAINT `quanhe_ibfk_1` FOREIGN KEY (`macanbo`) REFERENCES `canbo` (`macanbo`);

--
-- Các ràng buộc cho bảng `quatrinhcongtac`
--
ALTER TABLE `quatrinhcongtac`
  ADD CONSTRAINT `quatrinhcongtac_ibfk_1` FOREIGN KEY (`macanbo`) REFERENCES `canbo` (`macanbo`);

--
-- Các ràng buộc cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`maphongban`) REFERENCES `phongban` (`maphongban`),
  ADD CONSTRAINT `taikhoan_ibfk_2` FOREIGN KEY (`machucvu`) REFERENCES `chucvu` (`machucvu`);

--
-- Các ràng buộc cho bảng `thongtinnghihuu`
--
ALTER TABLE `thongtinnghihuu`
  ADD CONSTRAINT `thongtinnghihuu_ibfk_1` FOREIGN KEY (`macanbo`) REFERENCES `canbo` (`macanbo`);

--
-- Các ràng buộc cho bảng `tinhluong`
--
ALTER TABLE `tinhluong`
  ADD CONSTRAINT `fk_maluong` FOREIGN KEY (`maluong`) REFERENCES `luongcoban` (`maluong`),
  ADD CONSTRAINT `tinhluong_ibfk_1` FOREIGN KEY (`macanbo`) REFERENCES `canbo` (`macanbo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;


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