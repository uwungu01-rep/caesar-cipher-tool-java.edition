# Caesar Cipher Tool<sup><sup>TM</sup></sup> - Java Edition
A simple program use to Encipher/Decipher text to/from Caesar Cipher. And yes, there are more versions of this program from other programming languages.

## How this thing works
1. It slices the alphabet from the index of shift then add the sliced part to the start of the alphabet.
2. Find the index of every character in user input in the alphabet and append the character with the same index into the output. Add the character into the output if it doesn't exist in the alphabet.

## Functionality(ies)
1. Encipher/Decipher text to/from Caesar Cipher.

## Installation
<ol type="1">
  <li>
    Install Java 21 from [here](https://www.oracle.com/vn/java/technologies/downloads/#jdk21). (Ignore if you already have Java 21)
  </li>
  <li>
    Grab the [release](https://github.com/uwungu01-rep/caesar-cipher-tool-java.edition/releases/tag/tag) .zip and decompress it (not required, but recommended).
  </li>
  <li>
    On Windows:
    <ol type="i">
      <li>
        Run the run.exe executable.
      </li>
      <li>
        Alternatively, right click the folder contains the cct.jar file and choose "Open in Terminal" and run:

```
java -jar cct.jar
```
  </li>
  </ol>
  </li>
  <li>
    On other platforms: Navigate to the folder contains the cct.jar file and open the Terminal there then run:
    
```
java -jar cct.jar
```
  </li>
</ol>

## License
This project is licensed under the GNU General Public License 3.0, check [LICENSE](LICENSE) for more details.
