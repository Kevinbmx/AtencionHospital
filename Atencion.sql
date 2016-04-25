USE [Atencion]
GO
/****** Object:  Table [dbo].[tbl_atencionConsulta]    Script Date: 24/04/2016 13:19:49 ******/
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
/****** Object:  Table [dbo].[tbl_cita]    Script Date: 24/04/2016 13:19:49 ******/
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
/****** Object:  Table [dbo].[tbl_doctor]    Script Date: 24/04/2016 13:19:49 ******/
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
 CONSTRAINT [PK_tbl_doctor] PRIMARY KEY CLUSTERED 
(
	[doctorId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_paciente]    Script Date: 24/04/2016 13:19:49 ******/
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
 CONSTRAINT [PK_tbl_paciente] PRIMARY KEY CLUSTERED 
(
	[pacienteId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_permiso]    Script Date: 24/04/2016 13:19:49 ******/
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
/****** Object:  Table [dbo].[tbl_permisoUsuario]    Script Date: 24/04/2016 13:19:49 ******/
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
/****** Object:  Table [dbo].[tbl_usuario]    Script Date: 24/04/2016 13:19:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_usuario](
	[nombre] [nvarchar](150) NOT NULL,
	[apellido] [nvarchar](150) NOT NULL,
	[nombreUsuario] [nvarchar](150) NOT NULL,
	[contraseña] [int] NOT NULL,
	[usuarioId] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_tbl_usuario] PRIMARY KEY CLUSTERED 
(
	[usuarioId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

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
