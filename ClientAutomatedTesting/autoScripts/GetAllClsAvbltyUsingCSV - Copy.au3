#cs ----------------------------------------------------------------------------

 AutoIt Version: 3.3.14.2
 Author:         myName

 Script Function:
	Template AutoIt script.

#ce ----------------------------------------------------------------------------

; Script Start - Add your code below here

#include <GUIConstants.au3>
#include <string.au3>
#include <File.au3>


Global $Skipline = 0 ;0==> first line
Global $waitInMilliSec = 1000
Global $longWaitInMilliSec = 2000
Global $stnCodeSize = 4



Func _WinWaitActivate($title,$text,$timeout=0)
	WinWait($title,$text,$timeout)
	If Not WinActive($title,$text) Then WinActivate($title,$text)
	WinWaitActive($title,$text,$timeout)
EndFunc


; Execution starts


_WinWaitActivate("Program Manager","FolderView")
;MouseMove(410,882)
;MouseDown("left")
;MouseMove(410,871)
;MouseUp("left")


;for array - start

Local $aArray_Base[2] = ["Org Item 0", "Org item 1"]
Local $aArray = $aArray_Base
Local $stringToVerifySuccess = "DATE*_CLASS"

;for array - end

_WinWaitActivate("(B) TELNET (10.64.0.130) - PowerTerm 525","")

$path = "1"

;$file = FileOpen("D:\TestingModule\Assignments\2019-2020\AutomatedAvbltyEnquiry_17678_inProgress\AUTOIT_scripts\TDRC_InputFile.csv", 0)
$file = FileOpen("D:\APOSWorkSpaceInGradle\UsingKatlon\ClientAutomatedTesting\UserDataFiles\inputfiles\TDRC_InputFile.csv", 0)

If $file = -1 Then

MsgBox(0, "error", "File doesn't exist or can't be read")

Exit

EndIf
$countLine = 0
;Loop for every line in CSV
While 1
   $line = (FileReadLine($file))
   If @error = -1 Then ExitLoop
   If $Skipline = $countLine Then
	  $countLine += 1
	  ContinueLoop
	  EndIf
   $input = StringSplit($line, ",", 1)
   $trainNo = $input[1]
   $doj = $input[2]
   $dojDD = StringSplit($input[2], "-", 1)[2]
    $dojMM = StringSplit($input[2], "-", 1)[1]
   $src = $input[3]
   $destn = $input[4]

   $quota = $input[5]
 ;  MsgBox(0, "Values Read ", $trainNo & " , " & $doj & " , " &  $src  & " , " & $destn & " , " & $quota & " , "   )
   Send(12)
   Send($trainNo)
  ; Send("{TAB}")
   Sleep($waitInMilliSec)
   Send($dojDD)
   Sleep($waitInMilliSec)
   ;Send("{TAB}")

   Send($dojMM)
   Sleep($waitInMilliSec)
   Send($src)

   If StringLen ( $src ) < $stnCodeSize  Then Send("{TAB}")



   Send($destn)
   Sleep($waitInMilliSec)
   If StringLen ( $destn ) < $stnCodeSize  Then Send("{TAB}")

   Send($quota)
   Sleep($waitInMilliSec)


   MouseClick("right",685,299,1)
MouseMove(53,284)
MouseDown("left")
MouseMove(971,351)
MouseUp("left")



Sleep($waitInMilliSec)


    ; Retrieve the data stored in the clipboard.
    Local $sData = ClipGet()
	  Sleep($longWaitInMilliSec)
	  MsgBox($MB_SYSTEMMODAL, "", "The following data is stored in the clipboard: " & @CRLF & $sData)
	  ;MsgBox(0, "In CLIPGET STRING IS " &  $sData  )
	  If StringInStr ($sData, $stringToVerifySuccess)  Then
		 MsgBox($MB_SYSTEMMODAL, "", "SUCCESS MESSAGE FOUND"   )
	  EndIf


	ConsoleWrite($sdata)
   Sleep($waitInMilliSec)
   ; Local $sData = ClipGet()
	;Sleep(500)

    ; Display the data returned by ClipGet.
    ;MsgBox($MB_SYSTEMMODAL, "", "The following data is stored in the clipboard: " & @CRLF & $sData)

	; add data to array - start
	_ArrayAdd($aArray, $sdata)

	; add data to array - end

Send("{ENTER}")
Sleep($waitInMilliSec)
 Send("{CTRLDOWN}a{CTRLUP}")


;If $value1 = $path Then
$countLine += 1

WEnd

FileClose($file)
;_ArrayDisplay($aArray, "1D - Single")