echo off

set /p nome=Digite o nome da pasta usando " " (aspas duplas): 

if %nome% == "EMPRESA STARXX" (goto :opcao1) else (goto :opcao2)

:opcao1
cd C:\Users\Aluno2\Documents\Projetos
cd %nome%
mkdir %nome%
tree %nome%
goto :fim

:opcao2
mkdir %nome%
cd %nome%
mkdir Setores
cd Setores
mkdir Pasta1 Pasta2 Pasta3 Pasta4 Pasta5
cd..

tree 

:fim

pause
