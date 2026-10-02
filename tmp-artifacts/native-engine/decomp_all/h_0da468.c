// entry=0xda468

void Hda468(ulong param_1)

{
  bool bVar1;
  ulong uVar2;
  int iVar3;
  undefined **ppuVar4;
  uint uVar5;
  int in_w12;
  int unaff_w20;
  byte unaff_w26;
  
  uVar5 = 0x816b4072 - (-(int)DAT_0027b370 ^ 0xffffffffU);
  iVar3 = (uVar5 ^ -in_w12) + (uVar5 & -in_w12) * 2;
  if ((param_1 & 1) == 0) {
    iVar3 = in_w12;
  }
  uVar2 = (-DAT_0027b370 ^ 0x18fe90e4816b4083U) + (-DAT_0027b370 & 0x18fe90e4816b4083U) * 2;
  CallSupervisor(0);
  bVar1 = (-DAT_0027b370 | 0x18fe90e4816b3073U) + (-DAT_0027b370 & 0x18fe90e4816b3073U) < uVar2;
  uVar5 = -(int)DAT_0027b370;
  ppuVar4 = &PTR_LAB_00275a68;
  if (((bVar1 ^ (unaff_w26 ^ iVar3 != unaff_w20) & unaff_w26 ^ 1) & bVar1) == 0) {
    ppuVar4 = &PTR_LAB_00278340 + (int)((uVar5 | 0x816b409e) * 2 - (uVar5 ^ 0x816b409e));
  }
                    /* WARNING: Could not recover jumptable at 0x001dbb70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)(uVar2,(long)iVar3,0x18fe90e4816b4072 - (-DAT_0027b370 ^ 0xffffffffffffffffU),
                      (-DAT_0027b370 | 0x18fe90e4816b4073U) * 2 -
                      (-DAT_0027b370 ^ 0x18fe90e4816b4073U));
  return;
}


