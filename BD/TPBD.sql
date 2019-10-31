--1
select [TITULO], [AUTOR] from dbo.LIBRO where tipo='no'
--2
select [NRO_LIBRO], [PRECIO_ORI], [EDICION] from dbo.LIBRO where tipo='no' or PRECIO_ORI>21 or EDICION>1985
--3
select [AUTOR],[EDICION] from LIBRO where AUTOR like 'L%'
--4
select [AUTOR],[EDICION] from libro where not autor like 'G%'
--5
select [AUTOR],[PRECIO_ORI],[EDICION] from libro where autor like '%RR%'
--6 
select [TITULO],[EDICION] from libro where not PRECIO_ORI<12 and PRECIO_ORI>25
select [TITULO],[EDICION] from libro where not PRECIO_ORI between 12 and 25
--7
select distinct [TIPO],[EDICION] from libro order by [EDICION] asc
--7
SELECT distinct TIPO, EDICION FROM LIBRO order by EDICION ASC
--8
select NRO_LIBRO, EDICION, TIPO, PRECIO_ORI, PRECIO_ACT, (PRECIO_ACT-PRECIO_ORI) as diferencias from LIBRO order by TIPO, (PRECIO_ACT-PRECIO_ORI) asc
--9
select NRO_LIBRO, EDICION, TIPO, PRECIO_ORI, PRECIO_ACT, (PRECIO_ACT-PRECIO_ORI) as diferencias from libro where TIPO ='ES'
--10
select NRO_LIBRO, PRECIO_ORI, EDICION FROM LIBRO where EDICIOn>1985 and (TIPO='no' or PRECIO_ORI>21)
--11
select TITULO, AUTOR from LIBRO where tipo='no' or precio_ori>21
--12
select titulo, precio_ori from libro where edicion=1948 or edicion=1978 or edicion=1985
--13
select titulo, edicion from libro where precio_ori>=12 and precio_ori<=25
select titulo, edicion from libro where precio_ori between 12 and 25
--14
select titulo, precio_ori, edicion from libro where titulo like '%R%' and titulo like '%S%'
--15 
select titulo, precio_ori, edicion from libro where (SUBSTRING(titulo,2,1)) = 'A'
--16
select titulo,edicion from libro where tipo='no' order by edicion asc
--17
select nro_libro, edicion, tipo from libro where precio_ori>20 order by edicion desc, nro_libro asc
--18
select nro_libro, edicion, tipo, precio_ori, precio_act, (precio_act-precio_ori) as diferencias from libro where (precio_act-precio_ori) >10
--19
select nro_libro, edicion, tipo, precio_ori, precio_act, (precio_act-precio_ori) as diferencias from libro where (precio_act-precio_ori) >10 order by (precio_act-precio_ori) desc

---------FUNCIONES DE AGREGACION, HAVING -------------------------

--01 --
select sum(precio_ori) as sumatoria, avg(precio_ori) as promedio, min(precio_act) as mínimo, max(precio_act) as máximo from libro where edicion>1970
--02--
select sum(precio_ori+precio_act) as sumatoria, avg(precio_act+precio_ori) as promedio, min(precio_act-precio_ori) as MínDifPrecio, max(precio_act-precio_ori) as MáxDifPrecio from libro where edicion>1970
--03--
select distinct count(tipo) as cantLibros, min(precio_ori) as minimo, max(precio_ori) as maximo from libro where precio_ori>45
--4--
select tipo, sum(precio_ori) as total, avg(precio_ori) as promedio from libro where edicion<>1946 group by tipo having sum(precio_ori)>40
--5--
select tipo, avg(precio_ori) as promTipo from libro group by tipo having avg(precio_ori)> (select avg(precio_ori) from libro)
--6--
select tipo, sum(precio_ori) as sumatoria, avg(precio_act) as promedio from libro where edicion between 1946 and 1975 group by tipo 
--7--
select tipo, sum(precio_ori) as sumatoria, avg(precio_act) as promedio from libro where edicion<>1946 group by tipo order by avg(precio_Act) asc
--8--
select tipo, sum(precio_ori) as sumatoria, avg(precio_act) as promedio from libro where edicion between 1946 and 1975 group by tipo
--9--
select max(salario) from lector group by trabajo
--10--
select avg(salario) from lector where direccion like '%cap%' group by trabajo 

--------- Uso de Operadores Especiales (ALL, ANY) , SubQuery -------------------------


--01--
select substring(nombre, 1, 5) from lector
--02--
select nombre, direccion from lector where nro_lector in (select nro_lector from prestamo)
--03--
select nro_libro, titulo, precio_act from libro where precio_ori in(select max(precio_ori) from libro)
--04--
select nro_libro, titulo, precio_ori from libro where precio_ori >(select avg(precio_act) from libro)
--05--
select nro_libro, titulo, precio_ori from libro where precio_ori >all(select precio_ori from libro where tipo ='no')
--06--
select nro_libro, titulo, precio_ori from libro where precio_ori >any(select precio_ori from libro where tipo='no')


----------- Consultas en varias tablas – uso de join (inner join – left join – right join) -----------------
--1--
 select titulo, f_prest, f_devol from libro inner join prestamo on libro.nro_libro = prestamo.nro_libro
--2--
select libro.nro_libro, titulo, f_prest, f_devol from prestamo inner join libro on libro.nro_libro = prestamo.nro_libro
--3--
select prestamo.nro_lector nombre, count(Nro_copia) as cantPrestada from lector inner join prestamo on lector.nro_lector = prestamo.nro_lector group by prestamo.nro_lector
--4--
select prestamo.NRO_LIBRO, libro.titulo, prestamo.nro_copia, count(prestamo.nro_libro) as cantLibro from libro 
inner join prestamo on libro.nro_libro = prestamo.nro_libro
group by prestamo.nro_libro, libro.titulo, prestamo.nro_copia
--5--
select prestamo.NRO_LIBRO, libro.titulo, count(prestamo.nro_libro) as cant_prestamos 
from libro inner join prestamo on libro.nro_libro = prestamo.nro_libro and f_prest>=2012 
group by prestamo.nro_libro, libro.titulo, prestamo.nro_copia
--6--
select prestamo.nro_libro, libro.titulo, prestamo.nro_copia, count(*) as cant_prestamos  from libro inner join prestamo
on libro.nro_libro = prestamo.nro_libro
group by prestamo.nro_libro, libro.titulo, prestamo.nro_copia having count(prestamo.nro_libro)>1
--7--
select copias.nro_libro, libro.TITULO, prestamo.F_PREST from libro inner join copias on copias.nro_libro = libro.nro_libro left join prestamo on prestamo.NRO_LIBRO = libro.NRO_LIBROgroup by copias.nro_libro, libro.TITULO, PRESTAMO.F_PREST
--8--select lector.nro_lector, lector.nombre, prestamo.nro_libro, libro.titulo, TIPOLIBRO.desctipo, prestamo.f_prest, tipolibro.tipo from lector, prestamo, libro, tipolibrowhere prestamo.nro_libro = libro.nro_libro and prestamo.f_devol is not null and (TIPOLIBRO.TIPO = 'no' or TIPOLIBRO.TIPO = 'cu')group by lector.nro_lector, prestamo.nro_libro, libro.titulo, lector.nombre, tipolibro.desctipo, prestamo.f_prest, tipolibro.tipo--9--select libro.titulo, lector.nombre from libro, prestamo, lectorwhere lector.nro_lector = prestamo.nro_lector and prestamo.nro_libro = libro.Nro_librogroup by lector.nombre, libro.titulo--10--select lector.nro_Lector, lector.nombre, prestamo.f_prest from lector inner join prestamo on lector.nro_lector = prestamo.NRO_LECTOR and prestamo.F_DEVOL is nullgroup by lector.NRO_LECTOR, lector.NOMBRE, PRESTAMO.F_PREST--11--select lector.nro_Lector, lector.nombre, prestamo.NRO_LIBRO, libro.titulo, prestamo.F_PREST from lector, prestamo, librowhere lector.nro_lector = prestamo.NRO_LECTOR and prestamo.NRO_LIBRO = libro.NRO_LIBRO and prestamo.F_DEVOL is not nullgroup by lector.NRO_LECTOR, lector.NOMBRE, prestamo.NRO_LIBRO, libro.TItulo, PRESTAMO.F_PREST--12--select lector.nro_Lector, lector.nombre, prestamo.NRO_LIBRO, libro.titulo, prestamo.F_PREST from lector, prestamo, librowhere lector.nro_lector = prestamo.NRO_LECTOR and prestamo.NRO_LIBRO = libro.NRO_LIBRO and prestamo.F_DEVOL is not null and (libro.TIPO = 'no' or libro.TIPO = 'cu')group by lector.NRO_LECTOR, lector.NOMBRE, prestamo.NRO_LIBRO, libro.TItulo, PRESTAMO.F_PREST--13--select lector.nro_Lector, lector.nombre, prestamo.F_PREST from lector left join prestamo on LECTOR.NRO_LECTOR = PRESTAMO.NRO_LECTORgroup by lector.nro_lector, lector.nombre, PRESTAMO.F_PREST--------------E – Insert – Update - Delete---------------------01--insert libro (NRO_LIBRO,titulo,autor,tipo,PRECIO_ORI,PRECIO_ACT,EDICION) values (123,'prueba agregado','jhon doe','no',12500,13550,1948)insert copias (NRO_LIBRO, NRO_COPIA) values (123, 1)insert copias (NRO_LIBRO, NRO_COPIA) values (123, 2)insert copias (NRO_LIBRO, NRO_COPIA) values (123, 3)insert copias (NRO_LIBRO, NRO_COPIA) values (123, 4)--02--update libro set PRECIO_ACT = 35.35 where titulo = 'LAS MIL Y UNA NOCHES'--03--delete lector where SALARIO<1000 --se eliminaron 4 lectores