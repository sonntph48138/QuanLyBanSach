create database QuanLyBanSach
go
use QuanLyBanSach
go
create table NhanVien(
   IDNhanVien char(5) not null primary key,
   TenNhanVien nvarchar(30) not null,
   tendn varchar(20) not null unique,
   matkhau varchar(20) not null,
   ChucVu nvarchar(30),
   Email varchar(50),
   SoDienThoai char(13),
   DiaChi nvarchar(50)
)
insert into NhanVien values
('NV001',N'Nguyễn Văn A','nguyenvana','123456',N'Quản Lý','abc@gmail.com','0123456789',N'Hà Nội'),
('NV002',N'Trần Văn B','tranvanb','123456',N'Nhân Viên','cba@gmail.com','0987654321',N'Hải Phòng')
create table BanDoc(
   IDBanDoc char(5) not null primary key,
   TenBanDoc nvarchar(50) not null,
   tendn varchar(20) not null unique,
   matkhau varchar(20) not null,
   ChucVu nvarchar(30),
   Email varchar(50),
   SoDienThoai char(13),
   DiaChi nvarchar(50)
)
insert into BanDoc values
('BD001',N'Nguyễn Văn C','nguyenvanc','123456',N'Bạn Đọc','qwe@gmail.com','1230987654',N'Hà Nội'),
('BD002',N'Nguyễn Văn D','nguyenvand','123456',N'Bạn Đọc','asd@gmail.com','2141251231',N'Hà Nội')

create table TacGia(
   IDTacGia char(5) not null primary key,
   TenTacGia nvarchar(50) not null
)
insert into TacGia values
('TG001',N'Nguyễn Du'),
('TG002',N'Tô Hoài')

create table Sach(
   IDSach char(7) not null primary key,
   TieuDe nvarchar(30) not null,
   IDTacGia char(5) foreign key (IDTacGia) references TacGia(IDTacGia),
   NamXuatBan date,
   NhaXuatBan nvarchar(30),
   TheLoai nvarchar(30),
   SoLuongTonKho int,
)
insert into Sach values
('S001','ABCXYZ','TG001','1890-10-20',N'Kim Đồng',N'Văn học nghệ thuật',10),
('S002','QWERTY','TG002','1945-04-30',N'Kim Đồng',N'Văn học nghệ thuật',15)

create table PhieuMuon(
   IDPhieuMuon char(7) not null primary key,
   IDBanDoc char(5) foreign key (IDBanDoc) references BanDoc(IDBanDoc),
   IDNhanVien char(5) foreign key (IDNhanVien) references NhanVien(IDNhanVien),
   NgayMuon date,
   NgayTra date
)
insert into PhieuMuon values
('PM001','BD001','NV001','2023-02-20','2023-02-28'),
('PM002','BD002','NV002','2023-05-20','2023-05-28')

create table ChiTietPhieuMuon(
   IDChiTietPhieuMuon char(7) not null primary key,
   IDPhieuMuon char(7) foreign key (IDPhieuMuon) references PhieuMuon(IDPhieuMuon),
   IDSach char(7) foreign key (IDSach) references Sach(IDSach),
   SoLuongSachMuon int,
)

insert into ChiTietPhieuMuon values
('CTPM01','PM001','S001',2),
('CTPM02','PM002','S002',1)


select * from NhanVien
select * from Sach
select * from PhieuMuon
select * from TacGia
select IDChiTietPhieuMuon,IDPhieuMuon,IDSach,SoLuongSachMuon from ChiTietPhieuMuon
select * from BanDoc

insert into ChiTietPhieuMuon(IDChiTietPhieuMuon,IDPhieuMuon,IDSach,SoLuongSachMuon) values(?,?,?,?)

create view V_Sach as
Select IDSach,TieuDe,TenTacGia,NamXuatBan,NhaXuatBan,TheLoai,SoLuongTonKho 
from Sach s join TacGia tg on s.IDTacGia = tg.IDTacGia

select * from dbo.V_Sach

insert into TacGia(IDTacGia,TenTacGia) values (?,?)
update TacGia
set TenTacGia = ?
where IDTacGia = ?

select IDPhieuMuon ,IDBanDoc ,IDNhanVien,NgayMuon,NgayTra from PhieuMuon
insert into PhieuMuon(IDPhieuMuon ,IDBanDoc ,IDNhanVien,NgayMuon,NgayTra) values (?,?,?,?,?)
update PhieuMuon
set IDBanDoc =?, IDNhanVien = ?, NgayMuon = ?, NgayTra = ?
where IDPhieuMuon = ?

create procedure xoaDataPM @id char(7)
as
begin
     delete from PhieuMuon where IDPhieuMuon = @id
	 delete from ChiTietPhieuMuon where IDPhieuMuon = @id
end
exec dbo.xoaDataPM ?

select IDBanDoc,TenBanDoc,tendn,matkhau,ChucVu,Email,SoDienThoai,DiaChi from BanDoc
insert into BanDoc(IDBanDoc,TenBanDoc,tendn,matkhau,ChucVu,Email,SoDienThoai,DiaChi) values (?,?,?,?,?,?,?,?)
update BanDoc
set TenBanDoc = ?,tendn = ?,matkhau = ?,ChucVu = ?,Email = ?,SoDienThoai = ?,DiaChi = ?
where IDBanDoc = ?\
delete from BanDoc where IDBanDoc = ?