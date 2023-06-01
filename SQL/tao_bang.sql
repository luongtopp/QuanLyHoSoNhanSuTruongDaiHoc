CREATE DATABASE quan_ly_ho_so_nhan_su_truong_dai_hoc;
USE quan_ly_ho_so_nhan_su_truong_dai_hoc;
-- DROP DATABASE quan_ly_ho_so_nhan_su_truong_dai_hoc;
-- Bảng phòng ban
CREATE TABLE
    phongban (
        maphongban VARCHAR(50),
        tenphongban NVARCHAR (300),
        diachi NVARCHAR (300),
        sdt NVARCHAR (50),
        email NVARCHAR (50),
        PRIMARY KEY (maphongban)
    );
-- Bảng chức vụ
CREATE TABLE
    chucvu (
        machucvu VARCHAR(50),
        tenchucvu NVARCHAR (300),
--         phucapchucvu NVARCHAR (300),
        PRIMARY KEY (machucvu)
    );


-- Bảng cán bộ
CREATE TABLE
    canbo (
        macanbo VARCHAR(50),
        hotenkhaisinh NVARCHAR (100),
        gioitinh NVARCHAR (10),
        ngaysinh DATE,
        tinhtranghonnhan NVARCHAR (50),
        soCMND NVARCHAR (20),
        quequan NVARCHAR (500),
        noiohientai NVARCHAR (500),
        email NVARCHAR (50),
        dantoc NVARCHAR (100),
        tongiao NVARCHAR (300),
        ngayhopdong DATE,
        congviecduocgiao NVARCHAR (500),
		machucvu VARCHAR(50),
        chuyennganhdaotao NVARCHAR (300),
        noidaotao NVARCHAR (500),
        namtotnghiep INT,
        trinhdongoainnguthanhthaonhat NVARCHAR (500),
        maphongban VARCHAR(50),
        PRIMARY KEY (macanbo),
        FOREIGN KEY (maphongban) REFERENCES phongban (maphongban)
    );

-- Bảng quan hệ
CREATE TABLE
    quanhe (
        id INT AUTO_INCREMENT,
        macanbo VARCHAR(50),
        quanhe NVARCHAR (300),
        hoten NVARCHAR (300),
        namsinh DATE,
        gioitinh NVARCHAR (10),
        nghenghiep NVARCHAR (50),
        diachi NVARCHAR (50),
        PRIMARY KEY (id),
        FOREIGN KEY (macanbo) REFERENCES canbo (macanbo)
    );



-- Bảng chức vụ của cán bộ
CREATE TABLE
    chucvu_canbo (
        macanbo VARCHAR(50),
        maphongban VARCHAR(50),
        machucvu VARCHAR(50),
        tienkiemnhiem FLOAT,
        trangthai BIT,
        PRIMARY KEY (macanbo),
        FOREIGN KEY (maphongban) REFERENCES phongban (maphongban),
        FOREIGN KEY (machucvu) REFERENCES chucvu (machucvu)
    );

-- Bảng khen thưởng
CREATE TABLE
    khenthuong (
        id INT AUTO_INCREMENT,
        makhenthuong VARCHAR(50),
        macanbo VARCHAR(50),
        hinhthuckhenthuong NVARCHAR (50),
        ngaykhenthuong DATE,
        donvi NVARCHAR (50),
        danhhieu NVARCHAR (50),
        PRIMARY KEY (id),
        FOREIGN KEY (macanbo) REFERENCES canbo (macanbo)
    );

-- Bảng kỷ luật
CREATE TABLE
    kyluat (
        id INT AUTO_INCREMENT,
        makyluat VARCHAR(50),
        macanbo VARCHAR(50),
        namkyluat NVARCHAR (50),
        hinhthuckyluat NVARCHAR (50),
        donvi NVARCHAR (50),
        PRIMARY KEY (id),
        FOREIGN KEY (macanbo) REFERENCES canbo (macanbo)
    );


-- Đánh giá cán bộ
CREATE TABLE
    danhgiacanbo (
        id INT AUTO_INCREMENT,
        macanbo VARCHAR(50),
        namdanhgia DATE,
        loai NVARCHAR (100),
        nhanxet NVARCHAR (300),
        PRIMARY KEY (id),
        FOREIGN KEY (macanbo) REFERENCES canbo (macanbo)
    );

-- Quá trình công tác
CREATE TABLE
    quatrinhcongtac (
        id INT AUTO_INCREMENT,
        macanbo VARCHAR(50),
        thoigianbatdau DATE,
        thoigianketthuc DATE,
        congviec NVARCHAR (300),
        noicongtac NVARCHAR (300),
        machucvu VARCHAR(50),
        chucvucaonhat VARCHAR(50),
        PRIMARY KEY (id),
        FOREIGN KEY (macanbo) REFERENCES canbo (macanbo)
    );

-- Bảng nghỉ hưu
CREATE TABLE
    thong_tin_nghi_huu (
        macanbo VARCHAR(50),
        soqdnghihuu NVARCHAR (100),
        thoigiannghihuu DATE,
        PRIMARY KEY (macanbo),
        FOREIGN KEY (macanbo) REFERENCES canbo (macanbo)
    );

-- Bảng lương cơ bản
CREATE TABLE
    luong_co_ban (
        id INT AUTO_INCREMENT,
        luongtoithieu FLOAT,
        ngayapdung DATE,
        trangthai BIT,
        PRIMARY KEY (id)
    );

-- Bảng phụ cấp thêm
CREATE TABLE
    phucapthem (
        id INT AUTO_INCREMENT,
        sotien FLOAT,
        ngayapdung DATE,
        trangthai BIT,
        PRIMARY KEY (id)
    );

-- Bảng ngạch bậc
CREATE TABLE
    ngachbac (
        mangach VARCHAR(50),
        tenngach NVARCHAR (300),
        hesobatdau FLOAT,
        dochinh FLOAT,
        sobac FLOAT,
        PRIMARY KEY (mangach)
    );


-- Bảng tăng lương
CREATE TABLE
    tangluong (
        id INT,
        macanbo VARCHAR(50),
        mangach VARCHAR(50),
        bacmoi FLOAT,
        hesoluong FLOAT,
        huongtungay DATE,
        moctinhluonglansau DATE,
        trangthai BIT,
        PRIMARY KEY (id),
        FOREIGN KEY (macanbo) REFERENCES canbo (macanbo),
        FOREIGN KEY (mangach) REFERENCES ngachbac (mangach)
    );

-- Bảng tính lương
CREATE TABLE
    tinhluong (
        id INT AUTO_INCREMENT,
        macanbo VARCHAR(50),
        luongthuclinh FLOAT,
        thoigian DATE,
        PRIMARY KEY (id),
        FOREIGN KEY (macanbo) REFERENCES canbo (macanbo)
    );

-- Bảng tải khoản 
CREATE TABLE
    tai_khoan (
        tendn NVARCHAR (50),
        matkhau NVARCHAR (50),
        ngaycapquyen DATETIME,
        admin BIT,
        hoten NVARCHAR (100),
        maphongban VARCHAR (50),
        machucvu VARCHAR(50),
        email NVARCHAR (50),
        PRIMARY KEY (tendn),
        FOREIGN KEY (maphongban) REFERENCES phongban (maphongban),
        FOREIGN KEY (machucvu) REFERENCES chucvu (machucvu)
    );