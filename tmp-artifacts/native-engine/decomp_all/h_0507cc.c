// entry=0x507cc

void H507cc(void)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  int iVar3;
  code *UNRECOVERED_JUMPTABLE;
  long unaff_x19;
  
  iVar3 = *(int *)(unaff_x19 + 400);
  ppuVar2 = &PTR_LAB_00275d78;
  if (iVar3 != 0xf70) {
    ppuVar2 = &PTR_LAB_00284098;
  }
  ppuVar1 = &PTR_LAB_00275d78;
  if (iVar3 != 0xf2d) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = &PTR_LAB_00275d78;
  if (iVar3 != 0xf73) {
    ppuVar2 = ppuVar1;
  }
  UNRECOVERED_JUMPTABLE = (code *)*ppuVar2;
  *(undefined4 *)(unaff_x19 + 0x1cc) = 0;
                    /* WARNING: Could not recover jumptable at 0x00150818. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)();
  return;
}


