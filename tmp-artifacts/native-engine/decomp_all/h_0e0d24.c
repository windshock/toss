// entry=0xe0d24

void Hdfb74(void)

{
  undefined **ppuVar1;
  uint uVar2;
  int iVar3;
  undefined8 in_x13;
  undefined8 in_x14;
  long unaff_x19;
  long *unaff_x24;
  
  *(undefined8 *)(unaff_x19 + 0x18) = in_x14;
  *(undefined8 *)(unaff_x19 + 0x20) = in_x13;
  memset(unaff_x24,0,0x10);
  *unaff_x24 = (-DAT_00274f48 ^ 0xf676ba10cbf878adU) + (-DAT_00274f48 & 0xf676ba10cbf878adU) * 2;
  *(undefined4 *)(unaff_x24 + 1) = 0;
  unaff_x24[3] = 0;
  CallSupervisor(0);
  uVar2 = -(int)DAT_00274f48;
  iVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar2 | 0xcbf878ac) + (uVar2 & 0xcbf878ac)) * 300 +
                     (long)(int)(-0x340786a5 - (-(int)DAT_00274f48 ^ 0xffffffffU))])(0);
  ppuVar1 = &PTR_Hdd624_0027fff0;
  if (-1 < iVar3) {
    ppuVar1 = &PTR_LAB_002789d8;
  }
                    /* WARNING: Could not recover jumptable at 0x001dfcfc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


