USE [Atencion]
GO
/****** Object:  Table [dbo].[tbl_atencionConsulta]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_atencionConsulta](
	[atencionId] [int] IDENTITY(1,1) NOT NULL,
	[fechaHora] [timestamp] NOT NULL,
	[citaId] [int] NOT NULL,
 CONSTRAINT [PK_tbl_atencionConsulta] PRIMARY KEY CLUSTERED 
(
	[atencionId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_cita]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_cita](
	[citaId] [int] IDENTITY(1,1) NOT NULL,
	[fechaHora] [timestamp] NOT NULL,
	[doctorId] [int] NOT NULL,
	[pacienteId] [int] NOT NULL,
	[obsevacion] [nvarchar](250) NOT NULL,
	[usuarioId] [int] NOT NULL,
 CONSTRAINT [PK_tbl_cita] PRIMARY KEY CLUSTERED 
(
	[citaId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_doctor]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_doctor](
	[doctorId] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [nvarchar](150) NOT NULL,
	[apellido] [nvarchar](150) NOT NULL,
	[direccion] [nvarchar](150) NOT NULL,
	[usuarioId] [int] NOT NULL,
	[especialidadId] [int] NOT NULL,
 CONSTRAINT [PK_tbl_doctor] PRIMARY KEY CLUSTERED 
(
	[doctorId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_especialidad]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_especialidad](
	[especialidadId] [int] IDENTITY(1,1) NOT NULL,
	[nombre_especialidad] [nvarchar](150) NOT NULL,
 CONSTRAINT [PK_tbl_especialidad] PRIMARY KEY CLUSTERED 
(
	[especialidadId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_paciente]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_paciente](
	[pacienteId] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [nvarchar](150) NOT NULL,
	[apellido] [nvarchar](150) NOT NULL,
	[direccion] [nvarchar](150) NOT NULL,
	[alergia] [nvarchar](150) NOT NULL,
	[sexo] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_tbl_paciente] PRIMARY KEY CLUSTERED 
(
	[pacienteId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_permiso]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_permiso](
	[permisoId] [int] IDENTITY(1,1) NOT NULL,
	[nombrePermiso] [nvarchar](150) NOT NULL,
 CONSTRAINT [PK_tbl_permiso] PRIMARY KEY CLUSTERED 
(
	[permisoId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_permisoUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_permisoUsuario](
	[permisousuarioId] [int] IDENTITY(1,1) NOT NULL,
	[usuarioId] [int] NOT NULL,
	[permisoId] [int] NOT NULL,
 CONSTRAINT [PK_tbl_permisoUsuario] PRIMARY KEY CLUSTERED 
(
	[permisousuarioId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_usuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_usuario](
	[nombre] [nvarchar](150) NOT NULL,
	[apellido] [nvarchar](150) NOT NULL,
	[nombreUsuario] [nvarchar](150) NOT NULL,
	[contraseña] [nvarchar](50) NOT NULL,
	[usuarioId] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_tbl_usuario] PRIMARY KEY CLUSTERED 
(
	[usuarioId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  UserDefinedFunction [dbo].[buscarUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[buscarUsuario](@usuario varchar(50))
RETURNS TABLE
AS
RETURN(
SELECT usuarioId, nombreUsuario, contraseña
FROM 
tbl_usuario WHERE nombreUsuario = @usuario
)
GO
/****** Object:  UserDefinedFunction [dbo].[fnPacientetabla]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<,>
-- =============================================
CREATE FUNCTION [dbo].[fnPacientetabla]()

RETURNS TABLE 
AS
RETURN 
(
	SELECT *
	FROM tbl_paciente)


GO
/****** Object:  UserDefinedFunction [dbo].[fnseleccionpacienteid]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<,>
-- =============================================
CREATE FUNCTION [dbo].[fnseleccionpacienteid](@pacienteid int)

RETURNS TABLE 
AS
RETURN 
(
	SELECT pacienteId,nombre,apellido,direccion,alergia,sexo
	FROM tbl_paciente
	WHERE pacienteId = @pacienteid)


GO
/****** Object:  UserDefinedFunction [dbo].[selectPermiso]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[selectPermiso]()
RETURNS
TABLE
AS
RETURN 
(
	SELECT * FROM tbl_permiso
)

GO
/****** Object:  UserDefinedFunction [dbo].[selectPermisoUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[selectPermisoUsuario]()
RETURNS
TABLE
AS
RETURN 
(
	select permisousuarioId, u.nombreUsuario, p.nombrePermiso from tbl_permisoUsuario pu, tbl_usuario u, tbl_permiso p
		where pu.usuarioId = u.usuarioId and pu.permisoId = p.permisoId
)
GO
/****** Object:  UserDefinedFunction [dbo].[selectUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[selectUsuario]()
RETURNS
TABLE
AS
RETURN 
(
	SELECT usuarioId, nombre, apellido, nombreUsuario, contraseña FROM tbl_usuario
)
GO
ALTER TABLE [dbo].[tbl_atencionConsulta]  WITH CHECK ADD  CONSTRAINT [FK_tbl_atencionConsulta_tbl_cita] FOREIGN KEY([citaId])
REFERENCES [dbo].[tbl_cita] ([citaId])
GO
ALTER TABLE [dbo].[tbl_atencionConsulta] CHECK CONSTRAINT [FK_tbl_atencionConsulta_tbl_cita]
GO
ALTER TABLE [dbo].[tbl_cita]  WITH CHECK ADD  CONSTRAINT [FK_tbl_cita_tbl_doctor] FOREIGN KEY([doctorId])
REFERENCES [dbo].[tbl_doctor] ([doctorId])
GO
ALTER TABLE [dbo].[tbl_cita] CHECK CONSTRAINT [FK_tbl_cita_tbl_doctor]
GO
ALTER TABLE [dbo].[tbl_cita]  WITH CHECK ADD  CONSTRAINT [FK_tbl_cita_tbl_paciente] FOREIGN KEY([pacienteId])
REFERENCES [dbo].[tbl_paciente] ([pacienteId])
GO
ALTER TABLE [dbo].[tbl_cita] CHECK CONSTRAINT [FK_tbl_cita_tbl_paciente]
GO
ALTER TABLE [dbo].[tbl_cita]  WITH CHECK ADD  CONSTRAINT [FK_tbl_cita_tbl_usuario] FOREIGN KEY([usuarioId])
REFERENCES [dbo].[tbl_usuario] ([usuarioId])
GO
ALTER TABLE [dbo].[tbl_cita] CHECK CONSTRAINT [FK_tbl_cita_tbl_usuario]
GO
ALTER TABLE [dbo].[tbl_doctor]  WITH CHECK ADD  CONSTRAINT [FK_tbl_doctor_tbl_especialidad] FOREIGN KEY([especialidadId])
REFERENCES [dbo].[tbl_especialidad] ([especialidadId])
GO
ALTER TABLE [dbo].[tbl_doctor] CHECK CONSTRAINT [FK_tbl_doctor_tbl_especialidad]
GO
ALTER TABLE [dbo].[tbl_permisoUsuario]  WITH CHECK ADD  CONSTRAINT [FK_tbl_permisoUsuario_tbl_permiso] FOREIGN KEY([permisoId])
REFERENCES [dbo].[tbl_permiso] ([permisoId])
GO
ALTER TABLE [dbo].[tbl_permisoUsuario] CHECK CONSTRAINT [FK_tbl_permisoUsuario_tbl_permiso]
GO
ALTER TABLE [dbo].[tbl_permisoUsuario]  WITH CHECK ADD  CONSTRAINT [FK_tbl_permisoUsuario_tbl_usuario] FOREIGN KEY([usuarioId])
REFERENCES [dbo].[tbl_usuario] ([usuarioId])
GO
ALTER TABLE [dbo].[tbl_permisoUsuario] CHECK CONSTRAINT [FK_tbl_permisoUsuario_tbl_usuario]
GO
/****** Object:  StoredProcedure [dbo].[actualizarPaciente]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[actualizarPaciente]
(
	@nombre nvarchar(150),
	@apellido nvarchar(150),
	@direccion nvarchar(150),
	@alergia nvarchar(150),
	@sexo nvarchar(50),
	@pacienteId int
)
AS
BEGIN TRY
	BEGIN TRAN 
		UPDATE tbl_paciente set nombre = @nombre,
								apellido = @apellido,
								direccion = @direccion,
								alergia = @alergia,
								sexo = @sexo
		where pacienteId= @pacienteId
	COMMIT
END TRY
BEGIN CATCH
	ROLLBACK
	PRINT ERROR_MESSAGE()
END CATCH

GO
/****** Object:  StoredProcedure [dbo].[deletePermiso]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[deletePermiso]  @permisoid   INT        
AS 
BEGIN 

     DELETE FROM   tbl_permiso
     WHERE  
     permisoid = @permisoid
END

GO
/****** Object:  StoredProcedure [dbo].[deletePermisoUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[deletePermisoUsuario]  @permisousuarioId   int
AS 
BEGIN 

     DELETE FROM   tbl_permisoUsuario
     WHERE  
     permisousuarioId = @permisousuarioId
END
GO
/****** Object:  StoredProcedure [dbo].[deleteUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[deleteUsuario]  @usuarioId    INT        
AS 
BEGIN 

     DELETE FROM tbl_usuario
     WHERE  
     usuarioId = @usuarioId
END
GO
/****** Object:  StoredProcedure [dbo].[eliminarpaciente]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[eliminarpaciente]
(
	@Original_pacienteId int
)
AS
	SET NOCOUNT OFF;
DELETE FROM [tbl_paciente] WHERE (([pacienteId] = @Original_pacienteId))

GO
/****** Object:  StoredProcedure [dbo].[insertarpaciente]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[insertarpaciente]
(
	@nombre nvarchar(150),
	@apellido nvarchar(150),
	@direccion nvarchar(150),
	@alergia nvarchar(150),
	@sexo nvarchar(50)
)
AS
	SET NOCOUNT OFF;
INSERT INTO [tbl_paciente] ([nombre], [apellido], [direccion], [alergia], [sexo]) VALUES (@nombre, @apellido, @direccion, @alergia, @sexo);
	
SELECT pacienteId, nombre, apellido, direccion, alergia, sexo FROM tbl_paciente WHERE (pacienteId = SCOPE_IDENTITY())

GO
/****** Object:  StoredProcedure [dbo].[insertarPermiso]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[insertarPermiso]	@nombre varchar(30)
as 
begin try 
	begin tran
		insert into tbl_permiso(nombrePermiso)
		values (@nombre)
		commit
	end try
	begin catch
		rollback
		print error_message() 
	end catch

GO
/****** Object:  StoredProcedure [dbo].[insertarPermisoUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

create procedure [dbo].[insertarPermisoUsuario]	@usuarioId int,
										@permisoId int								
as 
begin try 
	begin tran
		insert into tbl_permisoUsuario(usuarioId, permisoId)
		values (@usuarioId, @permisoId)
		commit
	end try
	begin catch
		rollback
		print error_message() 
	end catch
GO
/****** Object:  StoredProcedure [dbo].[insertarUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

create procedure [dbo].[insertarUsuario]	@nombre varchar(30),
									@apellido varchar(30),
									@nombreUsuario varchar(30),
									@contraseña varchar(30)
as 
begin try 
	begin tran
		insert into tbl_usuario(nombre, apellido, nombreUsuario, contraseña)
		values (@nombre, @apellido, @nombreUsuario, @contraseña)
		commit
	end try
	begin catch
		rollback
		print error_message() 
	end catch
GO
/****** Object:  StoredProcedure [dbo].[selectpaciente]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[selectpaciente]
AS
	SET NOCOUNT ON;
SELECT        tbl_paciente.*
FROM            tbl_paciente

GO
/****** Object:  StoredProcedure [dbo].[updatePermiso]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[updatePermiso]	@permisoId varchar(30),
									@nombrePermiso varchar(30)
AS
BEGIN 
      SET NOCOUNT ON 
      UPDATE tbl_permiso
      SET  nombrePermiso = @nombrePermiso
      WHERE  
      permisoId = @permisoId
END
GO
/****** Object:  StoredProcedure [dbo].[updatePermisoUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[updatePermisoUsuario]	@permisousuarioId int,
											@usuarioId int,
											@permisoId int
AS
BEGIN 
      SET NOCOUNT ON 
      UPDATE tbl_permisoUsuario
      SET  usuarioId = @usuarioId,
			permisoId = @permisoId
      WHERE  
      permisousuarioId = @permisousuarioId
END
GO
/****** Object:  StoredProcedure [dbo].[updateUsuario]    Script Date: 27/04/2016 16:32:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[updateUsuario]	@usuarioId varchar(30),
									@nombre varchar(30),
									@apellido varchar(30),
									@nombreUsuario varchar(30),
									@contraseña varchar(30)
AS
BEGIN 
      SET NOCOUNT ON 
      UPDATE tbl_usuario
      SET  nombre = @nombre, 
	  apellido = @apellido,
	  nombreUsuario = @nombreUsuario, 
	  contraseña = @contraseña
      WHERE  
      usuarioId = @usuarioId
END
GO
