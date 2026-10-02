// entry=0xec680

void FUN_001ef078(void)

{
  char cVar1;
  char *in_x10;
  
  do {
    cVar1 = *in_x10;
    in_x10 = in_x10 + 1;
  } while (cVar1 != '\0');
                    /* WARNING: Could not recover jumptable at 0x001ea6f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00278060)();
  return;
}


