# MEdit4CEP - Extensión con Funcionalidad Geo

## Introducción

Este tutorial guía a través del proceso de extensión del proyecto MEdit4CEP para incorporar funcionalidades geo. Se basa en las modificaciones realizadas en el repositorio [geo-medit4cep](https://github.com/fherreraUY/geo-medit4cep).

## Pre-requisitos

- Familiaridad con Eclipse, Epsilon, EMF, GMF y Emfatic.
- Eclipse Neon (4.6) con una versión estable de Epsilon (v1.4), EMF, GMF y Emfatic instalados.

## Pasos Preliminares

### Configuración de Eclipse

1. Descarga y descomprime la distribución de Eclipse Neon (4.6) con Epsilon (v1.4), EMF, GMF y Emfatic.
2. Ejecuta Eclipse y establece un workspace.

### Clonación del Repositorio Original

1. En Eclipse, selecciona `File` > `Import` > `Git` > `Projects from Git`.
2. Usa el URI del repositorio: `https://neptuno.uca.es/git/medit4cep`.
3. Importa los proyectos clonados.

## Modificaciones Realizadas

### 1. Extensión del Metamodelo (ecore)

#### Modificación del Metamodelo

- Se ha modificado el archivo `/es.uca.modeling.cep.eventpattern/model/cep-eventpattern.emf`.
- Se añadieron nuevas metaclases utilizando el lenguaje Emfatic.
- Se incorporaron anotaciones GMF para la representación gráfica.

#### Generación del Editor GMF

- Tras realizar las modificaciones, se generó el editor GMF haciendo clic derecho sobre el archivo `.emf` y seleccionando `Eugenia` > `Generate GMF editor`.

### 2. Definición de Elementos Gráficos (geo)

#### Modificación de Herramientas en la Paleta

- Se realizaron cambios en el archivo `/es.uca.modeling.cep.eventpattern/model/ECore2GMF.eol` para añadir nuevas herramientas asociadas con las metaclases agregadas.

#### Incorporación de Imágenes SVG

- Se añadieron nuevas imágenes SVG en el directorio `platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/`.
- Ejemplos de imágenes añadidas incluyen: `NotEqual.svg`, `LessThan.svg`, `GreaterThan.svg`, entre otras.

#### Incorporación de Imágenes .gif

- Se agregaron imágenes en formato `.gif` en el directorio `/es.uca.modeling.cep.eventpattern.edit/icons/full/obj16`.

### 3. Cambios en Archivos EGL

- Se realizó una modificación en el archivo `geo-eventpattern-to-epl.egl` para adaptar la generación de código a las nuevas metaclases geo añadidas.

## Consideraciones Adicionales

