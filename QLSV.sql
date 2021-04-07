USE [HDTQLSV]
GO
/****** Object:  Table [dbo].[DIEM]    Script Date: 7/4/2021 10:41:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DIEM](
	[MALOPTC] [varchar](10) NOT NULL,
	[MASV] [varchar](10) NOT NULL,
	[DIEM] [float] NOT NULL,
 CONSTRAINT [PK_DIEM] PRIMARY KEY CLUSTERED 
(
	[MALOPTC] ASC,
	[MASV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KHOA]    Script Date: 7/4/2021 10:41:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHOA](
	[MAKHOA] [varchar](10) NOT NULL,
	[TENKHOA] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_KHOA] PRIMARY KEY CLUSTERED 
(
	[MAKHOA] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LOP]    Script Date: 7/4/2021 10:41:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOP](
	[MALOP] [varchar](10) NOT NULL,
	[TENLOP] [nvarchar](50) NOT NULL,
	[MAKHOA] [varchar](10) NOT NULL,
 CONSTRAINT [PK_LOP] PRIMARY KEY CLUSTERED 
(
	[MALOP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LOPTC]    Script Date: 7/4/2021 10:41:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOPTC](
	[MALOPTC] [varchar](10) NOT NULL,
	[MAMH] [varchar](10) NOT NULL,
	[NienKhoa] [nvarchar](50) NOT NULL,
	[HocKy] [int] NOT NULL,
	[NHOM] [int] NOT NULL,
	[svmax] [int] NOT NULL,
	[svmin] [int] NOT NULL,
 CONSTRAINT [PK_LOPTC] PRIMARY KEY CLUSTERED 
(
	[MALOPTC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MONHOC]    Script Date: 7/4/2021 10:41:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MONHOC](
	[MAMH] [varchar](10) NOT NULL,
	[TENMONHOC] [nvarchar](50) NOT NULL,
	[SOTINCHI] [int] NOT NULL,
 CONSTRAINT [PK_MONHOC] PRIMARY KEY CLUSTERED 
(
	[MAMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SINHVIEN]    Script Date: 7/4/2021 10:41:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SINHVIEN](
	[MASV] [varchar](10) NOT NULL,
	[HOTEN] [nvarchar](50) NOT NULL,
	[SODT] [nvarchar](15) NULL,
	[GIOITINH] [nvarchar](10) NOT NULL,
	[NGAYSINH] [nvarchar](50) NULL,
	[DIACHI] [nvarchar](50) NULL,
	[NAMNH] [int] NULL,
	[MALOP] [varchar](10) NOT NULL,
	[Password] [nvarchar](max) NULL,
 CONSTRAINT [PK_SINHVIEN] PRIMARY KEY CLUSTERED 
(
	[MASV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'15976', N'N13DCCN02', 0)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'15976', N'N15DCKT015', 9.5)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'15976', N'N15DCKT024', 8.5)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'15976', N'N16DCAT03', 5.5)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'15976', N'N16DCAT034', 8.3000001907348633)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'15976', N'N16DCCN01', 10)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'15976', N'N16DCCN035', 1)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'15976', N'N17CN01', 9)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'31749', N'N17DCCN02', 5.8)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'34581', N'N17DCCN022', 9.9)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'70369', N'N16DCKT025', 8.2)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'70369', N'N16DCVT024', 5.8)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'85903', N'N17CN01', 8.9)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'85903', N'N17DC02', 9.5)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'85903', N'N17DCAT016', 8.3)
INSERT [dbo].[DIEM] ([MALOPTC], [MASV], [DIEM]) VALUES (N'90091', N'N17DCATB', 8.8)
INSERT [dbo].[KHOA] ([MAKHOA], [TENKHOA]) VALUES (N'CNTT1', N'Công Nghệ Thông Tin 1')
INSERT [dbo].[KHOA] ([MAKHOA], [TENKHOA]) VALUES (N'CNTT2', N'Công Nghệ Thông Tin 2')
INSERT [dbo].[KHOA] ([MAKHOA], [TENKHOA]) VALUES (N'DTVT1', N'Điện Tử Viễn Thông 1')
INSERT [dbo].[KHOA] ([MAKHOA], [TENKHOA]) VALUES (N'DTVT2', N'Điện Tử Viển Thông 2')
INSERT [dbo].[KHOA] ([MAKHOA], [TENKHOA]) VALUES (N'QTKD1', N'Quản Trị Kinh Doanh 1')
INSERT [dbo].[KHOA] ([MAKHOA], [TENKHOA]) VALUES (N'QTKD2', N'Quản Trị Kinh Doanh 2')
INSERT [dbo].[LOP] ([MALOP], [TENLOP], [MAKHOA]) VALUES (N'D17AT01-N', N'An toàn thông tin', N'CNTT2')
INSERT [dbo].[LOP] ([MALOP], [TENLOP], [MAKHOA]) VALUES (N'D17CN01-N', N'Công nghệ thông tin', N'CNTT2')
INSERT [dbo].[LOP] ([MALOP], [TENLOP], [MAKHOA]) VALUES (N'D17KT01-N', N'Kế toán', N'QTKD1')
INSERT [dbo].[LOP] ([MALOP], [TENLOP], [MAKHOA]) VALUES (N'D17VT01-N', N'Điện tử viễn thông', N'DTVT2')
INSERT [dbo].[LOPTC] ([MALOPTC], [MAMH], [NienKhoa], [HocKy], [NHOM], [svmax], [svmin]) VALUES (N'15976', N'INTCNTT03', N'2016-2017', 2, 3, 20, 10)
INSERT [dbo].[LOPTC] ([MALOPTC], [MAMH], [NienKhoa], [HocKy], [NHOM], [svmax], [svmin]) VALUES (N'31749', N'INTATTT02', N'2012-2013', 2, 3, 40, 12)
INSERT [dbo].[LOPTC] ([MALOPTC], [MAMH], [NienKhoa], [HocKy], [NHOM], [svmax], [svmin]) VALUES (N'34581', N'INTATTT01', N'2010-2011', 2, 2, 20, 10)
INSERT [dbo].[LOPTC] ([MALOPTC], [MAMH], [NienKhoa], [HocKy], [NHOM], [svmax], [svmin]) VALUES (N'70369', N'INTCNTT01', N'2010-2011', 2, 2, 200, 10)
INSERT [dbo].[LOPTC] ([MALOPTC], [MAMH], [NienKhoa], [HocKy], [NHOM], [svmax], [svmin]) VALUES (N'84808', N'INTATTT01', N'2017-2018', 3, 1, 20, 10)
INSERT [dbo].[LOPTC] ([MALOPTC], [MAMH], [NienKhoa], [HocKy], [NHOM], [svmax], [svmin]) VALUES (N'85903', N'INTATTT01', N'2010-2011', 2, 3, 20, 10)
INSERT [dbo].[LOPTC] ([MALOPTC], [MAMH], [NienKhoa], [HocKy], [NHOM], [svmax], [svmin]) VALUES (N'90091', N'INTCNTT02', N'2017-2018', 1, 1, 55, 10)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INT0332', N'Mật mã học cơ bản', 2)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTATTT01', N'An toàn hệ điều hành', 3)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTATTT02', N'Cơ sở an toàn thông tin', 2)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTATTT03', N'Khoa học pháp lý số', 2)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTATTT04', N'An toàn mạng', 3)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTCNTT01', N'Ngôn ngữ C++', 3)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTCNTT02', N'Cấu trúc dữ liệu và Giải Thuật', 3)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTCNTT03', N'Lập Trình Hướng đối tượng', 3)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTCNTT04', N'Cơ sở dữ liệu', 3)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTDTVT01', N'Thông tin quang', 2)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTDTVT02', N'Tín hiệu và hệ thống', 2)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTDTVT03', N'Thông tin vô tuyến', 3)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTDTVT04', N'Quản lí mạng viễn thông', 2)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTKT01', N'Nguyên lí kế toán ', 3)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTKT02', N'Phân tích hoạt động kinh doanh', 3)
INSERT [dbo].[MONHOC] ([MAMH], [TENMONHOC], [SOTINCHI]) VALUES (N'INTKT03', N'Nguyên lí th?ng kê', 2)
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N13DCCN02', N'NGUYỄN TRẦN NAM', N'01214254211', N'Nam', N'26/04/1993', N'NHA TRANG', 2013, N'D17VT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N15DCKT015', N'TRẦN MINH HÂN', N'02020102245', N'Nam', N'25/01/1999', N'QUẬN 2 - THỦ ĐỨC', 2015, N'D17KT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N15DCKT024', N'ĐẬU THỊ TÂM', N'0202011212', N'Nữ', N'26/03/1999', N'NGHỆ AN', 2015, N'D17KT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N16DCAT03', N'Lê Hiếu', N'0101010020', N'Nam', N'02/05/2012', N'97 Man Thiện', 2017, N'D17AT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N16DCAT034', N'THÂN TRỌNG TRÂN CHÂU', N'0250220110', N'Nữ', N'14/01/1998', N'HUẾ', 2016, N'D17AT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N16DCCN01', N'Nguyễn Thông Bầu', N'07205225114', N'Nam', N'6/5/1998', N'51 Đỗ Xuân Hợp', 2017, N'D17AT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N16DCCN035', N'LÊ THỊ HỒNG LINH', N'02015422052', N'Nữ', N'16/1/2000', N'TRIỆU PHONG', 2016, N'D17VT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N16DCKT025', N'NGUYỄN QUỐC CƯỜNG', N'0779799778', N'Nam', N'12/2/2000', N'NHA TRANG', 2016, N'D17KT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N16DCVT024', N'NGUYỄN ĐÌNH HIẾU', N'02021025452', N'Nam', N'27/07/1999', N'QUẢNG TRỊ', 2016, N'D17VT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N17CN01', N'Nguyễn Thị Hương', N'0348295468', N'Nữ', N'30/4/1999', N'Đồng Nai', 2018, N'D17CN01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N17DC02', N'Trần Tuấn Vĩ', N'01012320101', N'Nam', N'31/08/1999', N'220 Lê Văn Sĩ', 2020, N'D17AT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N17DCAT016', N'Nguyễn Hùng Điệp', N'0342904876', N'Nam', N'25/11/1999', N'Bình Phước', 2016, N'D17KT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N17DCATB', N'Lê Chí Hiếu', N'0702300917', N'Nam', N'17/01/1998', N'5A Làng Tăng Phú', 2020, N'D17KT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N17DCCN02', N'Nguyễn Minh Thiện', N'0221201010', N'Nam', N'06/06/1999', N'51 Lê Văn Việt', 2017, N'D17CN01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N17DCCN022', N'TRẦN KIM TUYẾN', N'0250121012', N'Nữ', N'04/04/1998', N'QUẢNG BÌNH', 2016, N'D17CN01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N17DCCN032', N'LÊ THỊ LY NA', N'0725255225', N'Nữ', N'15/2/2000', N'QUẢNG TRỊ', 2016, N'D17VT01-N', N'e10adc3949ba59abbe56e057f20f883e')
INSERT [dbo].[SINHVIEN] ([MASV], [HOTEN], [SODT], [GIOITINH], [NGAYSINH], [DIACHI], [NAMNH], [MALOP], [Password]) VALUES (N'N17DCVT01', N'LÊ THỊ HỒNG YẾN', N'0200010010', N'Nữ', N'12/12/2000', N'TRIỆU ĐỘ', 2017, N'D17KT01-N', N'e10adc3949ba59abbe56e057f20f883e')
ALTER TABLE [dbo].[DIEM]  WITH CHECK ADD  CONSTRAINT [FK_DIEM_LOPTC] FOREIGN KEY([MALOPTC])
REFERENCES [dbo].[LOPTC] ([MALOPTC])
GO
ALTER TABLE [dbo].[DIEM] CHECK CONSTRAINT [FK_DIEM_LOPTC]
GO
ALTER TABLE [dbo].[DIEM]  WITH CHECK ADD  CONSTRAINT [FK_DIEM_SINHVIEN] FOREIGN KEY([MASV])
REFERENCES [dbo].[SINHVIEN] ([MASV])
GO
ALTER TABLE [dbo].[DIEM] CHECK CONSTRAINT [FK_DIEM_SINHVIEN]
GO
ALTER TABLE [dbo].[LOP]  WITH CHECK ADD  CONSTRAINT [FK_LOP_KHOA] FOREIGN KEY([MAKHOA])
REFERENCES [dbo].[KHOA] ([MAKHOA])
GO
ALTER TABLE [dbo].[LOP] CHECK CONSTRAINT [FK_LOP_KHOA]
GO
ALTER TABLE [dbo].[LOPTC]  WITH CHECK ADD  CONSTRAINT [FK_LOPTC_MONHOC] FOREIGN KEY([MAMH])
REFERENCES [dbo].[MONHOC] ([MAMH])
GO
ALTER TABLE [dbo].[LOPTC] CHECK CONSTRAINT [FK_LOPTC_MONHOC]
GO
ALTER TABLE [dbo].[SINHVIEN]  WITH CHECK ADD  CONSTRAINT [FK_SINHVIEN_LOP] FOREIGN KEY([MALOP])
REFERENCES [dbo].[LOP] ([MALOP])
GO
ALTER TABLE [dbo].[SINHVIEN] CHECK CONSTRAINT [FK_SINHVIEN_LOP]
GO
