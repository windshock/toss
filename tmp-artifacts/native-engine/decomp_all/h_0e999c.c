// entry=0xe999c

void He7c98(void)

{
  undefined **ppuVar1;
  long in_x5;
  
  ppuVar1 = (undefined **)&DAT_00284068;
  if (*(char *)(in_x5 + 2) != ' ') {
    ppuVar1 = &PTR_LAB_00274230;
  }
                    /* WARNING: Could not recover jumptable at 0x001e7cc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


