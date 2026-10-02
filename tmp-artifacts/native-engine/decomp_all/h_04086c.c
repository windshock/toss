// entry=0x4086c

void H3f718(void)

{
  undefined1 *puStack0000000000000090;
  undefined1 *puStack0000000000000098;
  undefined1 *puStack00000000000000a0;
  
  puStack00000000000000a0 = &stack0x000010ec;
  puStack0000000000000098 = &stack0x000010e8;
  puStack0000000000000090 = &stack0x000010e4;
                    /* WARNING: Could not recover jumptable at 0x0013f744. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277970)();
  return;
}


