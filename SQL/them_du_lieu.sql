USE quan_ly_ho_so_nhan_su_truong_dai_hoc;
-- Phòng ban
INSERT INTO
    phongban (maphongban, tenphongban, diachi, sdt, email)
VALUES
    (
        'PB206',
        'Phòng Đào tạo',
        'Phòng 206 Nhà H3 - Trường Đại học Công nghệ GTVT- Số 54 Triều Khúc - Thanh Xuân- Hà Nội',
        '0435526713',
        'phongdaotao@utt.edu.vn'
    ),
    (
        'PB102',
        'Phòng Công tác sinh viên',
        'Phòng 102, 104 Nhà H3 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội',
        '0435526714',
        'phongcthssv@utt.edu.vn'
    ),
    (
        'PB211',
        'Phòng Tài chính - Kế toán',
        'Phòng 211, 212 - Nhà H1 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội',
        '0438546903',
        'phongtckt@utt.edu.vn'
    ),
    (
        'PB202',
        'Phòng Khoa học công nghệ và Hợp tác quốc tế',
        'Phòng 202, 203 - Nhà H3 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội',
        '0435527872',
        'phongkhcn@utt.edu.vn'
    ),
    (
        'PB207',
        'Phòng Đào tạo Sau đại học',
        'Phòng 207 Nhà H1 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội',
        '0432222.865',
        'phongdtsdh@utt.edu.vn'
    ),
    (
        'PB101',
        'Phòng Hành chính - Quản trị',
        'Phòng 101, 102, Nhà H1- Trường Đại học Công nghệ GTVT- Số 54 Triều Khúc - Thanh Xuân- Hà Nội',
        '0435527493',
        'phonghcqt@utt.edu.vn'
    ),
    (
        'PB106',
        'Phòng Quản lý đầu tư và Xây dựng cơ bản',
        'Phòng 106, 107, Nhà H3- Trường Đại học Công nghệ GTVT- Số 54 Triều Khúc- Thanh Xuân- Hà Nội',
        '0435526714',
        'banxdcb@utt.edu.vn'
    ),
    (
        'PB304',
        'Phòng Tổ chức cán bộ',
        'Phòng 304, 202 Nhà H1 - Trường Đại học Công nghệ GTVT - Số 54 Triều Khúc - Thanh Xuân - Hà Nội',
        '0435523950',
        'phongtccb@utt.edu.vn'
    ),
    (
        'PB111',
        'Phòng Tổ chức cán bộ',
        'Phòng 111 Nhà H1 - Trường Đại học Công nghệ GTVT- Số 54 Triều Khúc- Thanh Xuân- Hà Nội',
        '0435523953',
        'thanhtragiaoduc@utt.edu.vn'
    );
    
-- Thêm chức vụ
INSERT INTO chucvu (machucvu, tenchucvu) 
VALUES ('CV01', 'Ban giám hiệu'),
	('CV02', 'Trưởng phòng'),
	('CV03', 'Chuyên viên'),
	('CV04', 'Giảng viên bộ môn Quản trị kinh doanh'),
	('CV05', 'Giảng viên bộ môn Truyền thông và Mạng máy tính'),
    ('CV06', 'Phó Bí thư Đoàn trường');
    

-- Thêm cán bộ
INSERT INTO
    `quan_ly_ho_so_nhan_su_truong_dai_hoc`.`canbo` (
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
        `congviecduocgiao`,
        `machucvu`,
        `chuyennganhdaotao`,
        `noidaotao`,
        `namtotnghiep`,
        `trinhdongoainnguthanhthaonhat`,
        `maphongban`
     
    )
VALUES
    (
        'CB003',
        N'Nguyễn Văn A',
        N'Nam',
        '1990-01-01',
        N'Độc thân',
        '123456789',
        N'Hà Nội',
        N'Hà Nội',
        'nguyenvana@gmail.com',
        N'Kinh',
        N'Không',
        '2021-01-01',
        N'Tiếp viên hàng không',
        'CV01',
        N'Quản trị kinh doanh',
        N'Đại học Kinh tế Quốc dân',
        2006,
        N'Tiếng Anh',
        'PB206'
    ),
    (
        'CB004',
        N'Trần Thị B',
        N'Nữ',
        '1995-02-01',
        N'Độc thân',
        '987654321',
        N'Hải Phòng',
        N'Hà Nội',
        'tranthib@gmail.com',
        N'Kinh',
        N'Không',
        '2021-02-01',
        N'Quản lý sản xuất',
        'CV02',
        N'Kỹ thuật điện',
        N'Đại học Bách Khoa Hà Nội',
        2003,
        N'Tiếng Trung',
        'PB206'
    ),
    (
        'CB005',
        N'Trần Thị B',
        N'Nữ',
        '1995-02-01',
        N'Độc thân',
        '987654321',
        N'Hải Phòng',
        N'Hà Nội',
        'tranthib@gmail.com',
        N'Kinh',
        N'Không',
        '2021-02-01',
        N'Quản lý sản xuất',
        'CV02',
        N'Kỹ thuật điện',
        N'Đại học Bách Khoa Hà Nội',
       2003,
        N'Tiếng Trung',
        'PB206'
    ),
    (
        'CB006',
        N'Trần Thị B',
        N'Nữ',
        '1995-02-01',
        N'Độc thân',
        '987654321',
        N'Hải Phòng',
        N'Hà Nội',
        'tranthib@gmail.com',
        N'Kinh',
        N'Không',
        '2021-02-01',
        N'Quản lý sản xuất',
        'CV02',
        N'Kỹ thuật điện',
        N'Đại học Bách Khoa Hà Nội',
        2002,
        N'Tiếng Trung',
        'PB206'
    );
    
  
    
    